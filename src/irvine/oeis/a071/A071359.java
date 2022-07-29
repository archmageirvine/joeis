package irvine.oeis.a071;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071359 Expansion of (1-x-sqrt(1-2*x-3*x^2-4*x^3))/(2*x*(1+x)).
 * Recurrence: a(0)=0, a(1)=1, a(2)=1, a(3)=2, a(n) = ((n-2)*a(n-1) +(5*n-7)*a(n-2) +(7*n-20) *a(n-3) +(4*n-14)*a(n-4))/(n+1).
 * @author Georg Fischer
 */
public class A071359 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071359() {
    super(0, "[[0],[-14, 4],[-20, 7],[-7, 5],[-2, 1],[-1,-1]", "0, 1, 1, 2", 0);
  }
}
