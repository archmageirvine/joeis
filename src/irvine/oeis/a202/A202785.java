package irvine.oeis.a202;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202785 Number of 3 X 3 0..n arrays with row and column sums equal.
 * @author Georg Fischer
 */
public class A202785 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A202785() {
    super(1, new long[] {0, 14, 3, 28, -14, 6, -1}, new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
