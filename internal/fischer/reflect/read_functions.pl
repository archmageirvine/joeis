#!perl

# Read joeis/src/irvine/math/function/Funcions.java and extract the corresponding A-numbers
# @(#) $Id$
# 2024-05-17, Georg Fischer: copied from packex.pl
#
#:# Usage:
#:#   perl read_functions.pl [-d debug] infile.java > outfile.gen
#--------------------------------------------------------
use strict;
use integer;
use warnings;
my ($sec, $min, $hour, $mday, $mon, $year, $wday, $yday, $isdst) = localtime (time);
my $timestamp = sprintf ("%04d-%02d-%02d %02d:%02d", $year + 1900, $mon + 1, $mday, $hour, $min);
if (0 && scalar(@ARGV) == 0) {
    print `grep -E "^#:#" $0 | cut -b3-`;
    exit;
}
my $mode = "u";
my $debug = 0;
my $callcode = "functions";
my $offset = 0;
while (scalar(@ARGV) > 0 and ($ARGV[0] =~ m{\A[\-\+]})) {
    my $opt = shift(@ARGV);
    if (0) {
    } elsif ($opt  =~ m{d}) {
        $debug     = shift(@ARGV);
    } elsif ($opt  =~ m{m}) {
        $mode      = shift(@ARGV);
    } else {
        die "invalid option \"$opt\"\n";
    }
} # while $opt

my $aseqno;
my $parm;
while (<>) { # read inputfile
    s{\s+\Z}{}; # chompr
    my $line = $_;
    if ($line =~ m{\/\/ *\= *(A\d+.*)}) {
        my $list = $1;
        $list =~ s{ |\;.*}{}g;
        if ($line =~ m{Function(\d) +([A-Z0-9_]+)}) {
            my ($ifunc, $static) = ($1, $2);
            if ($ifunc == 1) {
                $aseqno = $list;
                print join("\t", $aseqno, "Functions.$static.z(%)", "Functions.$static.i(%)") . "\n";
            } else {
                foreach my $seq (split(/\=/, $list)) {
                    ($aseqno, $parm) = split(/\(/, $seq);
                    print join("\t", $aseqno, , "Functions.$static.z(${parm} %)", "Functions.$static.i(${parm} %)") . "\n";
                }
            }
        } else {
            print "2: $line\n" if $debug >= 1;
        }
    } else {
        print "1: $line\n" if $debug >= 1;
    }
} # while <>
__DATA__
  public static final Function1 PARTITIONS = new Partitions(); // =A000041
  /** Next power of two larger than the given number. */
  public static final Function1 NEXT_POWER_OF_2 = new NextPowerOf2(); // =A062383

  /** Reverse the digits of a number. */
  public static final Function2 REVERSE = new Reverse(); // =A004086(10, =A305989(2,
  /** Number of digits in a number. */
