package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293004 Expansion of 2*x^2 / (x^3 + x^2 - 3x + 1).
 * @author Sean A. Irvine
 */
public class A293004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293004() {
    super(new long[] {-1, -1, 3}, new long[] {0, 0, 2});
  }
}
