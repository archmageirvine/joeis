package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099589 Expansion of x^3 / (1 - 4*x + 6*x^2 - 4*x^3 + 2*x^4).
 * @author Sean A. Irvine
 */
public class A099589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099589() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 0, 0, 1});
  }
}
