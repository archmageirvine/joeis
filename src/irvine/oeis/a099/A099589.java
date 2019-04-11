package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099589 Expansion of <code>x^3 / (1 - 4x + 6x^2 - 4x^3 + 2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A099589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099589() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 0, 0, 1});
  }
}
