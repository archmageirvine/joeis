package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028149 Expansion of 1/((1-4x)(1-7x)(1-9x)(1-10x)).
 * @author Georg Fischer
 */
public class A028149 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028149() {
    super(0, new long[] {1},
      new long[] {1, -30, 327, -1522, 2520});
  }
}
