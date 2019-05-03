package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008042 Coordination sequence <code>T2</code> for Zeolite Code ATT.
 * @author Sean A. Irvine
 */
public class A008042 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008042() {
    super(
      new long[] {1, 4, 10, 21, 33, 43, 55, 64, 61, 47, 26, 0, -26, -47, -61, -64, -55, -43, -33, -21, -10, -4, -1},
      new int[] {4, 5, 6, 7});
  }
}

