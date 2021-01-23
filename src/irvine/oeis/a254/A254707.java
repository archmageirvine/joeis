package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254707 Expansion of (1 + 2*x^2) / ((1 - x^2)^2 * (1 - x^3) * (1 - x^4)) in powers of x.
 * @author Sean A. Irvine
 */
public class A254707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254707() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {1, 0, 4, 1, 8, 4, 15, 8, 25, 15, 38});
  }
}
