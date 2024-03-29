package irvine.oeis.a240;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-17 20:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A240688 Expansion of -(x*sqrt(-4*x^2-4*x+1)-2*x^2-3*x) / ((x+1)*sqrt(-4*x^2-4*x+1)+ 4*x^3+8*x^2+3*x-1).
 * @author Georg Fischer
 */
public class A240688 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A240688() {
    // o.g.f. -(x*(-4*x^2-4*x+1)^(1/2)-2*x^2-3*x)/((x+1)*(-4*x^2-4*x+1)^(1/2)+4*x^3+8*x^2+3*x-1)
    // recurrence (8*(n-2)^2+18*n-30)*u(n-2)+4*(n-2)*n*u(n-3)+(3*n-2)*(n-1)*u(n-1)-(n-1)*n*u(n) = 0
    super(0, "[[0],[0,-8, 4],[2,-14, 8],[2,-5, 3],[0, 1,-1]]", "[1, 1, 5, 19]", 0);
  }
}
