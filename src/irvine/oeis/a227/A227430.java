package irvine.oeis.a227;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A227430 Expansion of x^2*(1-x)^3/((1-2*x)*(1-x+x^2)*(1-3*x+3x^2)).
 * @author Georg Fischer
 */
public class A227430 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A227430() {
    super(0, new long[] {0, 0, 1, -3, 3, -1},
      new long[] {1, -6, 15, -20, 15, -6});
  }
}
