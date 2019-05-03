package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008084 Coordination sequence <code>T1</code> for Zeolite Code ASV, EDI and THO.
 * @author Sean A. Irvine
 */
public class A008084 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008084() {
    super(
      new long[] {1, 3, 5, 9, 12, 9, 5, 3, 1},
      new int[] {1, 3, 4});
  }
}

