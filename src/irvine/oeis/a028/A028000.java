package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028000 Expansion of 1/((1-2*x)*(1-6*x)*(1-9*x)*(1-11*x)).
 * @author Georg Fischer
 */
public class A028000 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028000() {
    super(0, new long[] {1},
      new long[] {1, -28, 271, -1032, 1188});
  }
}
