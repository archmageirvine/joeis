package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008036 Coordination sequence T1 for Zeolite Code AST.
 * @author Sean A. Irvine
 */
public class A008036 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008036() {
    super(
      new long[] {1, 4, 9, 18, 27, 27, 20, 8, -8, -20, -27, -27, -18, -9, -4, -1},
      new int[] {3, 4, 4, 4});
  }
}

