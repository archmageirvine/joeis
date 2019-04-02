package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008111 Coordination sequence T1 for Zeolite Code GOO.
 * @author Sean A. Irvine
 */
public class A008111 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008111() {
    super(
      new long[] {1, 4, 9, 17, 28, 37, 39, 24, 8, 2, -3, -19, -42, -51, -38, -25, -41, -54, -44, -20, -6, 1, 9, 28, 41, 37, 29, 19, 9, 0, -1, 0, 2},
      new int[] {3, 3, 5, 7, 12});
  }
}
