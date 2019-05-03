package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008085 Coordination sequence <code>T2</code> for Zeolite Code EDI.
 * @author Sean A. Irvine
 */
public class A008085 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008085() {
    super(
      new long[] {1, 3, 4, 9, 10, 13, 8, 3, -3, -4, 4},
      new int[] {1, 3, 4});
  }
}

