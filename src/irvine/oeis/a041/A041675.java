package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041675 Denominators of continued fraction convergents to sqrt(356).
 * @author Sean A. Irvine
 */
public class A041675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041675() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000002, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 7, 8, 15, 38, 53, 462, 515, 1492, 2007, 3499, 23001, 26500, 977001, 1003501, 6998007, 8001508, 14999515, 38000538, 53000053, 462000962, 515001015, 1492002992, 2007004007, 3499006999L, 23001046001L, 26500053000L});
  }
}
