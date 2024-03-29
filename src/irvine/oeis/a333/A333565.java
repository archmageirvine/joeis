package irvine.oeis.a333;
// Generated by gen_seq4.pl holos at 2021-06-07 19:35
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A333565 O.g.f.: (1 + 4*x)/((1 + x)*sqrt(1 - 8*x)).
 * Recurrence: -n*(3*n-4)*a(n)+(21*n^2-40*n+12)*a(n-1)+4*(3*n-1)*(2*n-3)*a(n-2)
 * @author Georg Fischer
 */
public class A333565 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A333565() {
    super(0, "[[0],[12,-44, 24],[12,-40, 21],[0, 4,-3]]", "[1, 7]", 0);
  }
}
