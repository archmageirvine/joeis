package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008252 Coordination sequence T2 for Cordierite.
 * @author Sean A. Irvine
 */
public class A008252 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008252() {
    super(
      new long[] {1, 4, 11, 23, 44, 60, 69, 59, 29, -17, -76, -119, -142, -131, -90, -39, 25, 55, 77, 64, 54, 27, 13, 0, 1, -2},
      new int[] {4, 4, 5, 5, 6});
  }
}

