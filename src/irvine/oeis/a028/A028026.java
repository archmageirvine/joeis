package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028026 Expansion of 1/((1-3x)(1-4x)(1-5x)(1-7x)).
 * @author Georg Fischer
 */
public class A028026 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028026() {
    super(0, new long[] {1},
      new long[] {1, -19, 131, -389, 420});
  }
}
