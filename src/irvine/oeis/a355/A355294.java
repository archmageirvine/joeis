package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355294 Expansion of e.g.f. 1 / (1 - x - x^2/2 - x^3/3 - x^4/4).
 * @author Georg Fischer
 */
public class A355294 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355294() {
    // 12*a(n) = 12*n*a(n-1) + 6*n*(n-1)*a(n-2) + 4*n*(n-1)*(n-2)*a(n-3) + 3*n*(n-1)*(n-2)*(n-3)*a(n-4)
    super(0, "[[0],[0,-18,33,-18,3],[0,8,-12,4],[0,-6,6],[0,12],[-12]]", "1", 0);
  }
}
