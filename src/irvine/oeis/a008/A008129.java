package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008129 Coordination sequence <code>T1</code> for Zeolite Code LIO.
 * @author Sean A. Irvine
 */
public class A008129 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008129() {
    super(
      new long[] {1, 3, 6, 10, 14, 18, 20, 21, 22, 21, 20, 20, 21, 22, 21, 20, 18, 14, 10, 6, 3, 1},
      new int[] {1, 5, 15});
  }
}
