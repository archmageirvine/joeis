package irvine.oeis.a191;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-17 20:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A191782 Sum of the lengths of the first ascents in all n-length left factors of Dyck paths.
 * @author Georg Fischer
 */
public class A191782 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191782() {
    // o.g.f. 1/2/z*(1-(-4*z^2+1)^(1/2))*(1+1/4/z^3*(1-(-4*z^2+1)^(1/2))^2)/(1-z)/(1-1/2/z*(1-(-4*z^2+1)^(1/2)))
    // recurrence -4*(n+2)*(n-2)*u(n-1)-4*(n-6)*(n-5)*u(n-7)+2*(22*n-73)*(n-5)*u(n-6)-(59*(n-1)^2-315*n+721)*u(n-5)-(7*(n-1)^2+43*n-177)*u(n-4)-(-31*(n-1)^2+43*n+47)*u(n-3)-n*(n-23)*u(n-2) = 0
    super(1, "[[0],[-80, 36,-4],[408,-278, 44],[-406, 315,-59],[134,-43,-7],[-90,-43, 31],[22, 21,-1],[12,-8,-4]]", "[1, 3, 6, 13, 24, 49, 90]", 0);
  }
}
