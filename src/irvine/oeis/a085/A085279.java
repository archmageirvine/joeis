package irvine.oeis.a085;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A085279 Expansion of (1 - 2*x - 2*x^2)/((1 - 2*x)*(1 - 3*x)).
 * @author Georg Fischer
 */
public class A085279 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A085279() {
    super(0, new long[] {1, -2, -2},
      new long[] {1, -5, 6});
  }
}
