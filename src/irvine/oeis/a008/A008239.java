package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008239 Coordination sequence <code>T2</code> for Zeolite Code THO.
 * @author Sean A. Irvine
 */
public class A008239 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008239() {
    super(
      new long[] {1, 3, 5, 9, 11, 12, 14, 12, 11, 9, 5, 3, 1},
      new int[] {1, 3, 8});
  }
}
