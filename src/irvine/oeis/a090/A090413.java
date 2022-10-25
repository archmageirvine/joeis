package irvine.oeis.a090;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090413 A Chebyshev transform of 3^n.
 * @author Georg Fischer
 */
public class A090413 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090413() {
    // gf:= (1-(1-4*(-x^2))^(1/2))/(2*(-x^2))/(1-3*x*(1-(1-4*(-x^2))^(1/2))/(2*(-x^2))); subs(n=n-1,FindRE(gf,x,a(n)));
    // 18*(n+2)*n*a(n-1)+64*(n-3)*(n-2)*a(n-4)+72*(n+1)*(n-2)*a(n-3)-20*(n-2)*n*a(n-2)-9*(n+1)*n*a(n) = 0
    super(0, "[[0],[384,-320,64],[-144,-72,72],[0,40,-20],[0,36,18],[0,-9,-9]]", "1", 0);
  }
}
