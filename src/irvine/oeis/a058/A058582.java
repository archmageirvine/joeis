package irvine.oeis.a058;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A058582 Expansion of (1+3*x+4*x^2)/(1-4*x^2+4*x^4).
 * @author Georg Fischer
 */
public class A058582 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A058582() {
    super(0, new long[] {1, 3, 4},
      new long[] {1, 0, -4, 0, 4});
  }
}
