package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071731 Expansion of (1+x^3*C^2)*C^2, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071731 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071731() {
    // o.g.f. 1/4*(1+1/4*x*(1-(1-4*x)^(1/2))^2)*(1-(1-4*x)^(1/2))^2/x^2
    // recurrence -(n+2)*(3*(n-1)^2-2)*u(n)+2*(2*n-3)*(3*(n-1)^2+6*n-5)*u(n-1) = 0
    super(0, "[[0],[12,-8,-18, 12],[-2, 11, 0,-3]]", "1, 2, 5", 0);
  }
}
