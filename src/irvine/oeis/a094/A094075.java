package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A094075 Denominator of I(n)=integral_{x=0 to 1/n}(x^2-1)^3 dx.
 * @author Georg Fischer
 */
public class A094075 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094075() {
    super(1, new long[] {0, 105, 12600, 125055, 253680, 125055, 12600, 105},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
