jOEIS
=====

A collection of pure Java programs implementing sequences from The
On-Line Encyclopedia of Integer Sequences (OEIS):

https://oeis.org/

This is likely the largest coherent collection of programs for OEIS
sequences beyond the Maple, Mathematica, and Pari programs directly
associated with many entries.  Currently over 115,000 sequences are
implemented.

The jOEIS project is here:

https://github.com/archmageirvine/joeis

This archive is a binary release that contains the implementations of
all the sequences we currently provide.  After unzipping, and provided
Java 11 or later is installed and in the path, then, for example

java -jar joeis.jar -n 50 A000040

should generate the first fifty primes, and

java -jar joeis.jar --help

should provide command line help.

On a Linux-like system, ./joeis can be used in place of java -jar.

