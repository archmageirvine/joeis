package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A140154 a(1)=1, a(n) = a(n-1) + n^3 if n odd, a(n) = a(n-1) + n^2 if n is even.
 * @author Georg Fischer
 */
public class A140154 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140154() {
    super(1, new long[] {0, 1, 4, 23, 0, 23, -4, 1},
      new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1, -1});
  }
}
