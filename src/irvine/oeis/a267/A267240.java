package irvine.oeis.a267;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A267240 Number of n X 3 binary arrays with row sums nondecreasing and columns lexicographically nondecreasing.
 * @author Georg Fischer
 */
public class A267240 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A267240() {
    super(1, new long[] {0, 4, -27, 68, -76, 42, -9},
      new long[] {1, -10, 39, -76, 79, -42, 9});
  }
}
