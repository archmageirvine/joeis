package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266527 Coefficient of x^6 in the minimal polynomial of the continued fraction [1^n,2^(1/3),1,1,...], where 1^n means n ones.
 * @author Georg Fischer
 */
public class A266527 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A266527() {
    super(0, new long[] {1, -8, -158, -272, 2134, 2168, -1009, -130, 10},
      new long[] {1, -13, -104, 260, 260, -104, -13, 1});
  }
}
