package irvine.oeis.a176;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A176542 Numbers k such that there are only a finite nonzero number of sets of k consecutive triangular numbers that sum to a square.
 * @author Georg Fischer
 */
public class A176542 extends GeneratingFunctionSequence {


  /** Construct the sequence. */
  public A176542() {
    super(1, new long[] {0, -32, -18, 16, 6, -8}, new long[] {-1, 1, 2, -2, -1, 1});
  }
}
