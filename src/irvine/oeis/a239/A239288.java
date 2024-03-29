package irvine.oeis.a239;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A239288 Maximal sum of x0 + x0*x1 + ... + x0*x1*...*xk over all compositions x0 + ... + xk = n.
 * @author Georg Fischer
 */
public class A239288 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A239288() {
    super(0, new long[] {0, 1, 1, 2, -1, 1, -1, 1, -1},
      new long[] {1, -1, 0, -3, 3});
  }
}
