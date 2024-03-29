package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A317982 Expansion of 14*x*(29 + 784*x + 1974*x^2 + 784*x^3 + 29*x^4) / (1 - x)^7.
 * @author Georg Fischer
 */
public class A317982 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317982() {
    super(1, new long[] {0, 406, 10976, 27636, 10976, 406},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
