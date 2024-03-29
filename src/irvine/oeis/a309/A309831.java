package irvine.oeis.a309;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309831 Number of even parts appearing among the smallest parts of the partitions of n into 5 parts.
 * @author Georg Fischer
 */
public class A309831 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309831() {
    super(0, "[0,-1, 1, 1, 0, 0,-2, 0, 0, 1, 1, 0,-1,-1, 0, 0, 2, 0, 0,-1,-1, 1]", "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 5, 6, 9, 11, 15, 18]", 0);
  }
}
