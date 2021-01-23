package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008064 Coordination sequence T2 for Zeolite Code CAS.
 * @author Sean A. Irvine
 */
public class A008064 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008064() {
    super(
      new long[] {1, 4, 12, 24, 33, 32, 26, 8, -21, -41, -50, -54, -65, -71, -56, -26, 0, 26, 56, 71, 65, 54, 50, 41, 21, -8, -26, -32, -33, -24, -12, -4, -1},
      new int[] {3, 3, 4, 4, 8, 10});
  }
}

