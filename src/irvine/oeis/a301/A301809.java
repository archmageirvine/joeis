package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A301809 Group the natural numbers such that the first group is (1) then (2),(3),(4,5),(6,7,8),... with the n-th group containing F(n) sequential terms where F(n) is the n-th Fibonacci number (A000045(n)). Sequence gives the sum of terms in the n-th group.
 * @author Georg Fischer
 */
public class A301809 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301809() {
    super(1, new long[] {0, 1, -1, -4, 3, 2, -1},
      new long[] {1, -3, -1, 5, 1, -1});
  }
}
