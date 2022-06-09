package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008037 Coordination sequence T2 for Zeolite Code AST.
 * @author Sean A. Irvine
 */
public class A008037 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008037() {
    super(
      new long[] {1, 4, 12, 17, 21, 28, 24, 9, -9, -24, -28, -21, -17, -12, -4, -1},
      new int[] {3, 4, 4, 4});
  }
}

