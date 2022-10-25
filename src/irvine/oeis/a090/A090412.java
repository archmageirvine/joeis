package irvine.oeis.a090;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090412 A Chebyshev transform of 2^n.
 * @author Georg Fischer
 */
public class A090412 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090412() {
    // gf := -1/2*(1-(4*x^2+1)^(1/2))/x^2/(1+1/x*(1-(4*x^2+1)^(1/2))); subs(n=n-1,FindRE(gf,x,a(n)));
    // (n+7)*n*a(n-1)+12*(n-3)*(n-2)*a(n-4)+4*(n+6)*(n-2)*a(n-3)-5*(n-2)*n*a(n-2)-2*(n+1)*n*a(n) = 0
    super(0, "[[0],[72,-60,12],[-48,16,4],[0,10,-5],[0,7,1],[0,-2,-2]]", "1", 0);
  }
}
