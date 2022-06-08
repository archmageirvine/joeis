package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008248 Coordination sequence T2 for Zeolite Code YUG.
 * @author Sean A. Irvine
 */
public class A008248 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008248() {
    super(
      new long[] {1, 4, 10, 20, 31, 40, 42, 33, 17, 1, -17, -35, -42, -38, -32, -24, -11, 0, 3, 0, -2, -1},
      new int[] {3, 3, 5, 7});
  }
}
