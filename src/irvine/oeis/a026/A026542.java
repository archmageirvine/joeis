package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026542 Expansion of 1/((1-2x)(1-6x)(1-7x)(1-11x)).
 * @author Georg Fischer
 */
public class A026542 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026542() {
    super(0, new long[] {1},
      new long[] {1, -26, 233, -832, 924});
  }
}
