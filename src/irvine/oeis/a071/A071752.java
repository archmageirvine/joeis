package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071752 Expansion of (1+x^4*C^3)*C^3, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071752() {
    // o.g.f. 1/8*(1+1/8*x*(1-(1-4*x)^(1/2))^3)*(1-(1-4*x)^(1/2))^3/x^3
    // recurrence -(n+3)*(17*(n-1)^3+14*(n-1)^2-13*n+27)*u(n)+2*(2*n-3)*(17*(n-1)^3+65*(n-1)^2+66*n-34)*u(n-1) = 0
    super(0, "[[0],[-84, 134,-136,-46, 68],[-72,-54, 101,-14,-17]]", "1, 3, 9", 0);
  }
}
