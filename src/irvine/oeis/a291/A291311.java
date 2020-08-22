package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291311 Expansion of (1 - x^2)/(1 - 2 x + x^3 - x^4 + x^5 + x^6).
 * @author Sean A. Irvine
 */
public class A291311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291311() {
    super(new long[] {-1, -1, 1, -1, 0, 2}, new long[] {1, 2, 3, 5, 9, 16});
  }
}
