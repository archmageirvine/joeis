package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008047 Coordination sequence T1 for Zeolite Code BIK.
 * @author Sean A. Irvine
 */
public class A008047 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008047() {
    super(
      new long[] {1, 4, 12, 21, 32, 35, 16, -17, -53, -74, -69, -39, 6, 39, 42, 29, 14, 4, -1, -2},
      new int[] {3, 3, 4, 4, 4});
  }
}

