package irvine.oeis.a303;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A303609 a(n) = 2*n^3 + 9*n^2 + 9*n.
 * @author Georg Fischer
 */
public class A303609 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A303609() {
    super(0, new long[] {0, 20, -10, 2},
      new long[] {1, -4, 6, -4, 1});
  }
}
