package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A026028 Expansion of 1/((1-2x)(1-5x)(1-9x)(1-11x)).
 * @author Georg Fischer
 */
public class A026028 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026028() {
    super(0, new long[] {1},
      new long[] {1, -27, 249, -893, 990});
  }
}
