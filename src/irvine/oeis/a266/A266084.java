package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266084 Expansion of <code>(5 - x - x^2 - x^3 - x^4 + 4*x^5)/( x^6 - x^5 - x + 1)</code>.
 * @author Sean A. Irvine
 */
public class A266084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266084() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 4, 3, 2, 1, 10});
  }
}
