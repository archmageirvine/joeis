package irvine.oeis.a089;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089664 a(n) = S2(n,1), where S2(n, t) = Sum_{k=0..n} k^t *(Sum_{j=0..k} binomial(n,j))^2.
 * @author Georg Fischer
 */
public class A089664 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089664() {
    // o.g.f. x*(4-4*x-3*x*(1-4*x)^(1/2))/(1-4*x)^3
    // recurrence -(n-2)*(3*(n-2)^2-11*n+6)*u(n)+2*(n-2)*(12*(n-2)^2-29*n-45)*u(n-1)-8*(2*n-3)*(3*(n-2)^2-5*n-14)*u(n-2) = 0
    super(0, "[[0],[-48,-376, 344,-48],[-12, 314,-202, 24],[36,-64, 29,-3]]", "[0, 4, 41]", 0);
  }
}
