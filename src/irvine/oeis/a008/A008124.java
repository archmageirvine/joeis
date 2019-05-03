package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008124 Coordination sequence <code>T1</code> for Zeolite Code LAU.
 * @author Sean A. Irvine
 */
public class A008124 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008124() {
    super(
      new long[] {1, 4, 10, 20, 32, 46, 60, 68, 71, 67, 54, 38, 15, -15, -38, -54, -67, -71, -68, -60, -46, -32, -20, -10, -4, -1},
      new int[] {4, 5, 7, 9});
  }
}
