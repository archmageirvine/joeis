package irvine.oeis.a106;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A106612 a(n) = numerator(n/(n+11)).
 * @author Georg Fischer
 */
public class A106612 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A106612() {
    super(0, new long[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 18, -10, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 1},
      new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 4, -2, 0, 0, 0, 0, 
      0, 0, 0, 0, 1, -2, 1});
  }
}
