package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008029 Coordination sequence T1 for Zeolite Code AFY.
 * @author Sean A. Irvine
 */
public class A008029 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008029() {
    super(
      new long[] {1, 4, 8, 14, 24, 34, 40, 45, 49, 47, 40, 29, 14, 3, -1, -3, -2, 2, 3, 1},
      new int[] {4, 5, 6});
  }
}

