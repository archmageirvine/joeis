package irvine.oeis.a217;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A217275 Expansion of 2/(1-x+sqrt(1-2*x-27*x^2)).
 * Recurrence: (n+2)*a(n)=(2*n+1)*a(n-1)+(4*7-1)*(n-1)*a(n-2)
 * @author Georg Fischer
 */
public class A217275 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217275() {
    super(0, "[[0],[-27, 27],[1, 2],[-2,-1]]", "1, 1, 8, 22, 141, 561, 3291, 15583", 0);
  }
}
