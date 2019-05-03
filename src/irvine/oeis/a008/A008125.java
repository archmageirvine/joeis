package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008125 Coordination sequence <code>T2</code> for Zeolite Code LAU.
 * @author Sean A. Irvine
 */
public class A008125 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008125() {
    super(
      new long[] {1, 4, 10, 19, 31, 47, 60, 69, 71, 68, 58, 36, 10, -10, -36, -60, -68, -71, -69, -58, -47, -33, -17, -10, -4, 1, 0, -2},
      new int[] {4, 5, 7, 9});
  }
}
