package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028088 Expansion of 1/((1-3x)(1-6x)(1-11x)(1-12x)).
 * @author Georg Fischer
 */
public class A028088 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028088() {
    super(0, new long[] {1},
      new long[] {1, -32, 357, -1602, 2376});
  }
}
