package com.katja.storytour

// For setup of test location only
object TestDataModel {

    val testLocations: MutableList<Location> = mutableListOf(
        Location(
            mutableListOf(
                Waypoint(59.350442, 18.024624, "Sing as you walk to the crossing between Tomtebodavägen and Solnavägen."),
                Waypoint(59.350130, 18.023028, "Follow Solnavägen southwest, to SciLifeLab")
            ),
            mutableListOf(
                Storychoise(59.34965, 18.02752, "Gazebo","Have a look at a Gazebo"),
                Storychoise(59.351031, 18.024640, "Elephants","See the elephants")
        ),
    false, "Litsen to the beautiful sound of the Metal Bells."
        ),
        Location(
            mutableListOf(
                Waypoint(59.350442, 18.024624, "Walk like an elephant to the crossing between Tomtebodavägen and Solnavägen."),
                Waypoint(59.351031, 18.024640, "Cross the small park northeast of you.")
            ),
            mutableListOf(
                Storychoise(59.350130, 18.023028, "Music", "Litsen to bell music"),
                Storychoise(59.34965, 18.02752, "Gazebo", "Have a look at a Gazebo")
            ),
            false, "Say hi to the some elephants."
        ),
        Location(
            mutableListOf(
                Waypoint(59.349368, 18.027403, "Dance to the crossing between Solnavägen and Framstegsgatan."),
                Waypoint(59.350130, 18.023028, "Walk straight north")
            ),
            mutableListOf(
                Storychoise(59.351031, 18.024640, "Elephants", "See the elephants"),
                Storychoise(59.350130, 18.023028, "Music","Litsen to bell music")
            ),
            false, "Admire the beautiful Gazebo."
        )
    )

    val testLocationFirst = Location(
        mutableListOf(),  mutableListOf(
            Storychoise(59.351031, 18.024640, "Elephants", "See the elephants"),
            Storychoise(59.350130, 18.023028, "Music","Litsen to bell music")
        ),
        false, "Welcome to the adventure! What would you like to do?")

}

