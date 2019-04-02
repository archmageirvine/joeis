package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254594 Expansion of 1 / ((1 - x^2)^2 * (1 - x^3) * (1 - x^4)) in powers of x.
 * @author Sean A. Irvine
 */
public class A254594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254594() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {1, 0, 2, 1, 4, 2, 7, 4, 11, 7, 16});
  }
}
