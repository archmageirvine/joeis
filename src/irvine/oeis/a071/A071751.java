package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071751 Expansion of (1+x^4*C^3)*C^2, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071751 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071751() {
    // o.g.f. 1/4*(1+1/8*x*(1-(1-4*x)^(1/2))^3)*(1-(1-4*x)^(1/2))^2/x^2
    // recurrence -(n+2)*(23*(n-1)^3-37*(n-1)^2-12*n+40)*u(n)+2*(2*n-5)*(23*(n-1)^3+32*(n-1)^2-17*n+19)*u(n-1) = 0
    super(0, "[[0],[-280, 232, 322,-378, 92],[40,-242, 81, 60,-23]]", "1, 2, 5", 0);
  }
}
