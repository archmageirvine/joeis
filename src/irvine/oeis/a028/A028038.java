package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028038 Expansion of 1/((1-3x)(1-4x)(1-7x)(1-8x)).
 * @author Georg Fischer
 */
public class A028038 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028038() {
    super(0, new long[] {1},
      new long[] {1, -22, 173, -572, 672});
  }
}
