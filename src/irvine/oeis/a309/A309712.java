package irvine.oeis.a309;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309712 Number of odd parts appearing among the third largest parts of the partitions of n into 4 parts.
 * @author Georg Fischer
 */
public class A309712 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309712() {
    super(0, "[0, 1,-2, 1, 0, 0, 0,-1, 2,-2, 2,-1, 0, 0, 0, 1,-2, 1]", "[0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 5, 6, 9, 10, 13, 14]", 0);
  }
}
