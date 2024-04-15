package irvine.oeis.a069;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069247 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A069247() {
    super(0, new long[] {1, 0, 5, 77, 300, 908, 2139, 3808, 5864, 8257, 10456, 12504, 14294, 15115, 15115, 14294, 12504, 10456, 8257, 5864, 3808, 2139, 908, 300, 77, 5, 0, 1},
      new long[] {1, -2, -1, 2, 3, 0, -6, -1, 5, 2, -1, -4, -1, 3, 0, 3, -1, -4, -1, 2, 5, -1, -6, 0, 3, 2, -1, -2, 1});
  }
}
