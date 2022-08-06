package irvine.oeis.a156;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156554 The number of integer sequences of length d = 2n+1 such that the sum of the terms is 0 and the sum of the absolute values of the terms is d-1.
 * Recurrence: n^2*(2*n - 1)^2*(24*n^3 - 105*n^2 + 152*n - 73)*a(n) = (3264*n^7 - 20808*n^6 + 53900*n^5 - 73159*n^4 + 55963*n^3 - 24107*n^2 + 5436*n - 504)*a(n - 1) - (2*n - 1)*(2*n - 3)*(n - 2)^2*(24*n^3 - 33*n^2 + 14*n - 2)*a(n - 2).
 * @author Georg Fischer
 */
public class A156554 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156554() {
    super(0, "[[0],[24,-256, 1114,-2502, 3083,-2072, 708,-96],[-504, 5436,-24107, 55963,-73159, 53900,-20808, 3264],[0, 0, 73,-444, 1005,-1052, 516,-96]]", "1, 6", 0);
  }
}
