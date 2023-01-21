package irvine.oeis.a067;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A067296 Fifth column of triangle A028364.
 * Recurrence: (193*n^5+2885*n^4+15665*n^3+38275*n^2+41262*n+15120)*a(n+1) +(-772*n^5-10382*n^4-51566*n^3-115348*n^2-110832*n-32400)*a(n) = 0.
 * @author Georg Fischer
 */
public class A067296 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067296() {
    super(0, "[[0],[-32400,-110832,-115348,-51566,-10382,-772],[15120,41262,38275,15665,2885,193]]", "42", 1);
  }
}
