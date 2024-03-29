package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266471 Number of 4 X n binary arrays with rows and columns lexicographically nondecreasing and column sums nonincreasing.
 * @author Georg Fischer
 */
public class A266471 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A266471() {
    super(1, new long[] {0, 5, -18, 32, -28, 11, -1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
