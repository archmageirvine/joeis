package irvine.oeis.a355;
// manually hologf4/hologf at 2022-11-09 21:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355511 a(n) is the number of monic polynomials of degree n over GF(11) without linear factors.
 * @author Georg Fischer
 */
public class A355511 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355511() {
    // o.g.f. (1-z)^11/(1-11*z)-1
    // recurrence -u(n)+11*u(n-1) = 0
    super(0, "[[0],[11],[-1]]", "[0, 0, 55, 440, 5170, 56408, 620950, 6830120, 75131485, 826446280, 9090909091, 100000000000, 1100000000000]", 0);
  }
}
