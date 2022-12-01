package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071726 Expansion of (1+x^3*C)*C, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071726 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071726() {
    // o.g.f. 1/2*(1+1/2*x^2*(1-(1-4*x)^(1/2)))*(1-(1-4*x)^(1/2))/x
    // recurrence -(n+1)*(17*(n-1)^2-31*n+43)*u(n)+2*(2*n-5)*(17*(n-1)^2+3*n-5)*u(n-1) = 0
    super(0, "[[0],[-120, 358,-294, 68],[-60, 5, 48,-17]]", "1, 1, 2, 6", 0);
  }
}
