package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A317983 Expansion of 420*x*(1 + x)*(1 + 10*x + x^2) / (1 - x)^6.
 * @author Georg Fischer
 */
public class A317983 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317983() {
    super(1, new long[] {0, 420, 4620, 4620, 420},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
