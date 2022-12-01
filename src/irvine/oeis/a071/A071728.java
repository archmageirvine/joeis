package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071728 Expansion of (1+x^3*C)*C^3, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071728 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071728() {
    // o.g.f. 1/8*(1+1/2*x^2*(1-(1-4*x)^(1/2)))*(1-(1-4*x)^(1/2))^3/x^3
    // recurrence -(n+3)*(25*(n-1)^3+27*(n-1)^2-10*n-8)*u(n)+2*(2*n-3)*(25*(n-1)^3+102*(n-1)^2+119*n-95)*u(n-1) = 0
    super(0, "[[0],[108,-12,-202,-42, 100],[18,-27, 133,-27,-25]]", "[1, 3, 9]", 0);
  }
}
