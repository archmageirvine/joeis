package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028185 Expansion of 1/((1-5x)(1-7x)(1-9x)(1-11x)).
 * @author Georg Fischer
 */
public class A028185 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028185() {
    super(0, new long[] {1},
      new long[] {1, -32, 374, -1888, 3465});
  }
}
