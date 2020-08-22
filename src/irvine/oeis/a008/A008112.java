package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008112 Coordination sequence T2 for Zeolite Code GOO.
 * @author Sean A. Irvine
 */
public class A008112 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008112() {
    super(
      new long[] {1, 4, 10, 18, 28, 34, 34, 30, 22, 12, 4, 0, -3, -6, -14, -25, -38, -50, -61, -61, -50, -38, -25, -14, -6, -3, 0, 4, 12, 22, 30, 34, 34, 28, 18, 10, 4, 1},
      new int[] {3, 3, 5, 12, 14});
  }
}
