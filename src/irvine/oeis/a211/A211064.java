package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211064 Number of 2 X 2 matrices having all terms in {1,...,n} and even determinant.
 * @author Georg Fischer
 */
public class A211064 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211064() {
    super(1, new long[] {0, -1, -9, -27, -83, -59, -51, -9, -1},
      new long[] {-1, 1, 4, -4, -6, 6, 4, -4, -1, 1});
  }
}
