package irvine.oeis.a089;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089665 a(n) = S2(n,2), where S2(n, t) = Sum_{k=0..n} k^t *(Sum_{j=0..k} binomial(n,j))^2.
 * @author Georg Fischer
 */
public class A089665 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089665() {
    // o.g.f. x*(4+12*x-x*(4*x^2+2*x+3)*(1-4*x)^(1/2))/(1-4*x)^4
    // recurrence -(n-2)*(n-1)*(7*(n-2)^4-33*(n-2)^3-28*(n-2)^2+34*n-84)*u(n)+2*(n-2)*(28*(n-2)^5-41*(n-2)^4-426*(n-2)^3-278*(n-2)^2+326*n-789)*u(n-1)-8*n*(2*n-5)*(7*(n-2)^4-5*(n-2)^3-85*(n-2)^2-93*n+150)*u(n-2) = 0
    super(0, "[[0],[0,-1520,-872, 5112,-4248, 1256,-112],[180, 398, 3540,-5980, 3328,-754, 56],[-360, 1488,-2278, 1666,-619, 110,-7]]", "[0, 4, 73]", 0);
  }
}
