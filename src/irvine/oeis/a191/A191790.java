package irvine.oeis.a191;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-17 20:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A191790 Number of base pyramids in all length n left factors of Dyck paths.
 * @author Georg Fischer
 */
public class A191790 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191790() {
    // o.g.f. 1/4/z^2*(1-(-4*z^2+1)^(1/2))^2/(-z^2+1)/(1-1/2/z*(1-(-4*z^2+1)^(1/2)))
    // recurrence -n*(n-3)*u(n-1)-4*(n-2)*(n-3)*u(n-5)-(2*n-4)*u(n-4)+(5*n-8)*(n-3)*u(n-3)-(-2*n+4)*u(n-2) = 0
    super(0, "[[0],[-8, 12,-4],[2,-2],[6,-13, 5],[-2, 2],[2, 1,-1]]", "[0, 0, 1, 1, 4, 5, 14]", 0);
  }
}
