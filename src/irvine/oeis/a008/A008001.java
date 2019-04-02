package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008001 Coordination sequence T1 for Zeolite Code AEI.
 * @author Sean A. Irvine
 */
public class A008001 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008001() {
    super(
      new long[] {1, 4, 9, 16, 25, 35, 43, 47, 50, 54, 56, 54, 50, 45, 37, 26, 14, 4, -4, -14, -26, -37, -45, -50, -54, -56, -54, -50, -47, -43, -35, -25, -16, -9, -4, -1},
      new int[] {3, 5, 11, 16});
  }
}

