package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A083580 Binomial transform of A083579.
 * @author Georg Fischer
 */
public class A083580 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083580() {
    super(0, new long[] {0, 1, -4, 5},
      new long[] {1, -7, 16, -12});
  }
}
