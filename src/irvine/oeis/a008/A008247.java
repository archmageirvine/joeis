package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008247 Coordination sequence T1 for Zeolite Code YUG.
 * @author Sean A. Irvine
 */
public class A008247 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008247() {
    super(
      new long[] {1, 4, 11, 20, 30, 34, 30, 14, -11, -42, -60, -64, -56, -39, -16, 9, 29, 39, 34, 22, 8, 2, -1, 1, 1},
      new int[] {3, 3, 4, 5, 7});
  }
}
