package irvine.oeis.a103;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A103648 Expansion of -x*(2*x^11-2*x^9+3*x^7-2*x^6-x^5+x^3-x^2-1) / ((x-1)*(2*x^12+x^8-1)).
 * @author Georg Fischer
 */
public class A103648 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A103648() {
    super(0, new long[] {0, 1, 0, 1, -1, 0, 1, 2, -3, 0, 2, 0, -2},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, -2, 2});
  }
}
