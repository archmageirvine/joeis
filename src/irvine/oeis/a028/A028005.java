package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028005 Expansion of 1/((1-2x)(1-7x)(1-8x)(1-9x)).
 * @author Georg Fischer
 */
public class A028005 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028005() {
    super(0, new long[] {1},
      new long[] {1, -26, 239, -886, 1008});
  }
}
