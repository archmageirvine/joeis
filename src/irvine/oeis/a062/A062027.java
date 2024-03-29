package irvine.oeis.a062;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A062027 a(1) = a(2) = a(3) = 1 and a(n) = 24*binomial(n+1, 5) + n*(n^2 - n + 6) for n &gt; 3.
 * Recurrence: a(n)=(n+1)*(n)*(n-1)*(n-2)*(n-3)/5+n(n^2-n+6)
 * @author Georg Fischer
 */
public class A062027 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A062027() {
    super(1, "[[0, 24, 0, 10,-5, 1],[-5]]", "1, 1, 1, 96", 0);
  }
}
