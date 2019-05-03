package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008110 Coordination sequence <code>T1</code> for Zeolite Code GME and AFX.
 * @author Sean A. Irvine
 */
public class A008110 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008110() {
    super(
      new long[] {1, 4, 9, 17, 28, 40, 52, 62, 66, 62, 52, 40, 28, 17, 9, 4, 1},
      new int[] {4, 5, 7});
  }
}

