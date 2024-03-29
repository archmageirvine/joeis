package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A267083 Coefficient of x^5 in the minimal polynomial of the continued fraction [1^n,2^(1/3),1,1,...], where 1^n means n ones.
 * @author Georg Fischer
 */
public class A267083 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A267083() {
    super(0, new long[] {3, -54, -228, 2364, -5976, -8118, 3153, 390, -30},
      new long[] {1, -13, -104, 260, 260, -104, -13, 1});
  }
}
