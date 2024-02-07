jOEIS Installation
==================

jOEIS is a pure Java project using the "ant" build system.

## Prerequisites for building from source

* Java 1.8 or later (see https://openjdk.java.net/install/)
* apache ant 1.10 or later (see https://ant.apache.org/)

Both of these requirements likely can be installed using the package management system of your operating system. You can test that appropriate versions are available with the following commands.

    $ java -version
    $ ant -version

## Check out source code for jOEIS

    $ git clone https://github.com/archmageirvine/joeis.git
    $ cd joeis

There are no other library dependencies, all libraries needed by jOEIS are already included in the repository.

## Build a jar

    $ ant jar

This will use the `build.xml` file to compile the appropriate sources, writing a resulting jar file into `~/joeis/build.tmp/joeis.jar`.  This jar contains a default entry point, suitable for generating terms of all the sequences implement in jOEIS.  This command can take 1/2 hour or more on a fresh install.

## Generating a sequence

The command

    $ java -jar ~/joeis/build.tmp/joeis.jar A000001

will generate terms of the requested sequence, one per line.  Depending on the sequence chosen, other messages may be produced indicating that the sequence is not (yet) implemented, is "dead", or unsupported for some other reason.

Most sequences will continue to produce a large number of terms, often way more than listed in the OEIS data lines or even b-files. However, some sequences require immense time or memory resources and terms may become excessively slow to produce in such cases. Finite sequences terminate output at their natural end point.

