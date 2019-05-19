package irvine.oeis.a002;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A002727 Number of <code>3 X n</code> binary matrices up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A002727 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002727() {
    super(new long[] {1, 0, 1, 2, 1, 0, 1},
      new long[] {1, -4, 4, 2, -2, -4, -3, 12, -3, -4, -2, 2, 4, -4, 1});
  }
}
