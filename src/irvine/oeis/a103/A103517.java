package irvine.oeis.a103;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A103517 Expansion of (1+2*x-x^2)/(1-x)^2.
 * @author Georg Fischer
 */
public class A103517 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A103517() {
    super(0, new long[] {1, 2, -1},
      new long[] {1, -2, 1});
  }
}
