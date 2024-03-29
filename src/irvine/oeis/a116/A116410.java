package irvine.oeis.a116;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A116410 Expansion of (1-x-2x^2+sqrt(1-2x-3x^2))/(2*(1-2x-3x^2)).
 * Recurrence: a(n)=((5*n-4)*a(n-1)-(3*n-6)*a(n-2)-(9*n-18)*a(n-3))/n
 * @author Georg Fischer
 */
public class A116410 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116410() {
    super(0, "[[0],[18,-9],[6,-3],[-4, 5],[0,-1]]", "1, 1, 3, 8, 23, 66, 192, 561, 1647", 0);
  }
}
