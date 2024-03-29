package irvine.oeis.a179;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179608 a(n) = (7 + (-1)^n + 6*n)*2^(n-3).
 * @author Georg Fischer
 */
public class A179608 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A179608() {
    super(0, new long[] {1, 1},
      new long[] {1, -2, -4, 8});
  }
}
