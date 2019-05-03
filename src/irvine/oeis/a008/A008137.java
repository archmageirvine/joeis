package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008137 Coordination sequence <code>T1</code> for Zeolite Code LTA and RHO.
 * @author Sean A. Irvine
 */
public class A008137 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008137() {
    super(
      new long[] {1, 2, 2, 3, 3, 2, 2, 1},
      new int[] {1, 1, 5});
  }
}
