package irvine.oeis.a331;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A331394 Number of ways of 4-coloring the Fibonacci square spiral tiling of n squares with colors introduced in order.
 * Recurrence: a(n)=a(n-1)-a(n-2)+2*a(n-3)
 * @author Georg Fischer
 */
public class A331394 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331394() {
    super(1, "[[0],[2],[-1],[1],[-1]]", "1, 1, 1, 2, 3, 5, 6, 7, 11", 0);
  }
}
