package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028189 Expansion of 1/((1-5x)(1-7x)(1-11x)(1-12x)).
 * @author Georg Fischer
 */
public class A028189 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028189() {
    super(0, new long[] {1},
      new long[] {1, -35, 443, -2389, 4620});
  }
}
