package irvine.oeis.a091;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A091103 Expansion of (1-3*x+12*x^2)/((1-3*x)*(1+3*x)).
 * @author Georg Fischer
 */
public class A091103 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A091103() {
    super(0, new long[] {1, -3, 12},
      new long[] {1, 0, -9});
  }
}
