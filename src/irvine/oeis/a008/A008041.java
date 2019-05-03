package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008041 Coordination sequence <code>T1</code> for Zeolite Code ATT.
 * @author Sean A. Irvine
 */
public class A008041 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008041() {
    super(
      new long[] {1, 4, 9, 18, 32, 47, 59, 64, 59, 47, 28, 0, -28, -47, -59, -64, -59, -47, -32, -18, -9, -4, -1},
      new int[] {4, 5, 6, 7});
  }
}

