package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008181 Coordination sequence T1 for Zeolite Code MON.
 * @author Sean A. Irvine
 */
public class A008181 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008181() {
    super(
      new long[] {1, 4, 11, 22, 38, 48, 48, 38, 0, -32, -72, -102, -96, -89, -35, 3, 29, 58, 48, 45, 23, 6, 4, -2, 1, 1},
      new int[] {3, 4, 4, 6, 6});
  }
}
