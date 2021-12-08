package irvine.oeis.a107;

import irvine.oeis.HolonomicRecurrence;

/**
 * A107587 Number of Motzkin n-paths with an even number of up steps.
 * n*(n+2)*a(n) + (-5*n^2-n+3)*a(n-1) + (10*n^2-16*n+3)*a(n-2) + (-10*n^2+34*n-27)*a(n-3) - (11*n-5)*(n-3)*a(n-4) + 15*(n-3)*(n-4)*a(n-5) = 0.
 * @author Georg Fischer
 */
public class A107587 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A107587() {
    super(0, "[[0],[180,-105, 15],[-15, 38,-11],[-27, 34,-10],[3,-16, 10],[3,-1,-5],[0, 2, 1]]", "1", 0);
  }
}
