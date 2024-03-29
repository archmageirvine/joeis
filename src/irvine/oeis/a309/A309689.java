package irvine.oeis.a309;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309689 Number of even parts appearing among the second largest parts of the partitions of n into 3 parts.
 * @author Georg Fischer
 */
public class A309689 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309689() {
    super(0, "[0,-1, 2,-2, 2,-1, 0, 1,-2, 2,-2, 1]", "[0, 0, 0, 0, 0, 1, 2, 2, 2, 3]", 0);
  }
}
