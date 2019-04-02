package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008228 Coordination sequence T2 for Zeolite Code PHI.
 * @author Sean A. Irvine
 */
public class A008228 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008228() {
    super(
      new long[] {1, 4, 9, 17, 27, 35, 41, 47, 50, 48, 43, 36, 26, 10, -10, -26, -36, -43, -48, -50, -47, -41, -35, -27, -17, -9, -4, -1},
      new int[] {3, 4, 10, 10});
  }
}
