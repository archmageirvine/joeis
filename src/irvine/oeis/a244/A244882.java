package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244882 Expansion of (1 + 2*x + 2*x^2) / (1 - x)^6.
 * @author Sean A. Irvine
 */
public class A244882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244882() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 8, 35, 110, 280, 616});
  }
}
