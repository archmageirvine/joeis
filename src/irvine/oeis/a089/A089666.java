package irvine.oeis.a089;
// manually hologf4/hologf at 2022-11-09 13:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089666 a(n) = S2(n, 3), where S2(n, t) = Sum_{k=0..n} k^t *(Sum_{j=0..k} binomial(n,j))^2.
 * @author Georg Fischer
 */
public class A089666 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089666() {
    // o.g.f. x*(32*x^3+48*x^2+60*x+4-3*x*(4*x^3-6*x^2+6*x+1)*(1-4*x)^(1/2))/(1-4*x)^5
    // recurrence -(n-2)^2*(15*(n-2)^5-30*(n-2)^4-243*(n-2)^3-182*(n-2)^2+120*n-112)*u(n)+2*(n-2)*n*(60*(n-2)^5-45*(n-2)^4-1137*(n-2)^3-821*(n-2)^2+1181*n-2368)*u(n-1)-8*n*(2*n-5)*(15*(n-2)^5+45*(n-2)^4-213*(n-2)^3-941*(n-2)^2-1018*n+1844)*u(n-2) = 0
    super(0, "[[0],[0, 960,-2384, 9480,-2392,-4632, 2280,-240],[0,-3216, 13364,-6362,-6250, 5826,-1530, 120],[-576, 208, 2800,-5056, 3752,-1377, 240,-15]]", "[0, 4, 137]", 0);
  }
}
