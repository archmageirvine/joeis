package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028101 Expansion of 1/((1-3x)(1-8x)(1-9x)(1-12x)).
 * @author Georg Fischer
 */
public class A028101 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028101() {
    super(0, new long[] {1},
      new long[] {1, -32, 363, -1692, 2592});
  }
}
