package irvine.oeis.a085;
// manually hologf4/hologf at 2022-11-09 21:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A085801 Maximum number of nonattacking queens on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A085801 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A085801() {
    // o.g.f. (2*x^12-x^11+2*x^10+2*x^9+x^8-x^7+3*x^6-x^5+3*x^4+x^3+1)/(x^13-x^12-x+1)
    // recurrence -(3*n-20)*u(n)+3*u(n-1)+3*u(n-2)+3*u(n-3)+3*u(n-4)+3*u(n-5)+3*u(n-6)+3*u(n-7)+3*u(n-8)+3*u(n-9)+3*u(n-10)+3*u(n-11)-(-3*n+17)*u(n-12) = 0
    super(1, "[[0],[-17, 3],[3],[3],[3],[3],[3],[3],[3],[3],[3],[3],[3],[20,-3]]", "[1, 1, 1, 2, 5, 4, 7, 6, 7, 9, 11, 10, 13]", 1);
  }
}
