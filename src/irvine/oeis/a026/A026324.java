package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A026324 Expansion of 1/((1-2x)(1-6x)(1-7x)(1-8x)).
 * @author Georg Fischer
 */
public class A026324 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026324() {
    super(0, new long[] {1},
      new long[] {1, -23, 188, -628, 672});
  }
}
