package irvine.oeis.a071;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071722 Expansion of (1+x^2*C^2)*C^3, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071722 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071722() {
    // simplify(subs(n=n-1,FindRE((1+x^2*((1-(1-4*x)^(1/2))/(2*x))^2)*((1-(1-4*x)^(1/2))/(2*x))^3,x,a(n))));
    // (20*n^2-90*n+100)*a(n-3)+(-21*n^2+39*n+30)*a(n-2)+(28*n^2+36*n+8)*a(n-1)-6*(n+3)*n*a(n) = 0
    super(0, "[[0],[100,-90,20],[30,39,-21],[8,36,28],[0,-18,-6]]", "1", 0);
  }
}
