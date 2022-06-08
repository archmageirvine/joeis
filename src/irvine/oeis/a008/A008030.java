package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008030 Coordination sequence T2 for Zeolite Code AFY.
 * @author Sean A. Irvine
 */
public class A008030 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008030() {
    super(
      new long[] {1, 4, 9, 15, 18, 20, 27, 31, 21, 0, -21, -31, -27, -20, -18, -15, -9, -4, -1},
      new int[] {3, 4, 5, 6});
  }
}

