package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008063 Coordination sequence T1 for Zeolite Code CAS.
 * @author Sean A. Irvine
 */
public class A008063 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008063() {
    super(
      new long[] {1, 4, 12, 22, 37, 57, 70, 72, 80, 82, 57, 26, 14, -24, -84, -108, -103, -128, -164, -136, -96, -101, -98, -31, 18, 21, 44, 88, 92, 70, 66, 63, 42, 21, 13, 4, -1, -2},
      new int[] {3, 5, 8, 8, 12});
  }
}

