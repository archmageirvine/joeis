package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071755 Expansion of (1+x^4*C^4)*C^2, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071755 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071755() {
    // o.g.f. 1/4*(1+1/16*(1-(1-4*x)^(1/2))^4)*(1-(1-4*x)^(1/2))^2/x^2
    // recurrence -(n+2)*(19*(n-1)^2-15*n+29)*u(n)+2*(2*n-3)*(19*(n-1)^2+23*n-5)*u(n-1) = 0
    super(0, "[[0],[-84, 146,-174, 76],[-96, 58, 15,-19]]", "1, 2, 5", 0);
  }
}
