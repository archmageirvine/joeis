package irvine.oeis.a102;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-09 23:22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A102406 Number of Dyck paths of semilength n having no ascents of length 1 that start at an even level.
 * @author Georg Fischer
 */
public class A102406 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102406() {
    // o.g.f. 1/2*(1+z+z^2-(z^4-2*z^3-5*z^2-2*z+1)^(1/2))/z/(1+z)^2
    // recurrence -(n+1)*u(n)-(-n+3)*u(n-1)-(-7*n+9)*u(n-2)-(-7*n+12)*u(n-3)+n*u(n-4)-(n-4)*u(n-5) = 0
    super(0, "[[0],[4,-1],[0, 1],[-12, 7],[-9, 7],[-3, 1],[-1,-1]]", "[1, 0, 1, 2, 5, 14]", 0);
  }
}
