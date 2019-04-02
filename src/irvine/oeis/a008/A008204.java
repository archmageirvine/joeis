package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008204 Coordination sequence T2 for Zeolite Code NAT.
 * @author Sean A. Irvine
 */
public class A008204 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008204() {
    super(
      new long[] {1, 4, 7, 12, 20, 24, 3, 8, 4, -12, -7, -12, -4, -20, -11, -8, -13, -16, 20, 12, -12, -32, 16, 20, 12, -12, -4},
      new int[] {2, 3, 3, 8});
  }
}
