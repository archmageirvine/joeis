package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071727 Expansion of (1+x^3*C)*C^2, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071727 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071727() {
    // o.g.f. 1/4*(1+1/2*x^2*(1-(1-4*x)^(1/2)))*(1-(1-4*x)^(1/2))^2/x^2
    // recurrence -(n+2)*(67*(n-1)^3-93*(n-1)^2-28*n+40)*u(n)+2*(2*n-5)*(67*(n-1)^3+108*(n-1)^2-13*n-29)*u(n-1) = 0
    super(0, "[[0],[-120, 328, 818,-1042, 268],[240,-598, 229, 160,-67]]", "1, 2, 5", 0);
  }
}
