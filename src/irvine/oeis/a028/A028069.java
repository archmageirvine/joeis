package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028069 Expansion of 1/((1-3x)(1-5x)(1-9x)(1-11x)).
 * @author Georg Fischer
 */
public class A028069 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028069() {
    super(0, new long[] {1},
      new long[] {1, -28, 274, -1092, 1485});
  }
}
