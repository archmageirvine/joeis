package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A025802 Expansion of 1/((1-x^2)*(1-x^4)*(1-x^5)).
 * @author Georg Fischer
 */
public class A025802 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025802() {
    super(0, new long[] {1},
      new long[] {1, 0, -1, 0, -1, -1, 1, 1, 0, 1, 0, -1});
  }
}
