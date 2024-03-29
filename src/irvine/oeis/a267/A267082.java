package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A267082 Coefficient of x^4 in the minimal polynomial of the continued fraction [1^n,2^(1/3),1,1,...], where 1^n means n ones.
 * @author Georg Fischer
 */
public class A267082 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A267082() {
    super(0, new long[] {0, 6, 372, -684, 4938, -1092, -168, 12},
      new long[] {1, -14, -90, 350, -90, -14, 1});
  }
}
