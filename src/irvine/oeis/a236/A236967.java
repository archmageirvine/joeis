package irvine.oeis.a236;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A236967 Expansion of (1+3*x)^2/(1-3*x)^2.
 * @author Georg Fischer
 */
public class A236967 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A236967() {
    super(0, new long[] {1, 6, 9},
      new long[] {1, -6, 9});
  }
}
