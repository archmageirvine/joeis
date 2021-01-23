package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147663 Expansion of 1/(1 - x - x^2 + x^3 - x^7 + x^9 - x^11).
 * @author Sean A. Irvine
 */
public class A147663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147663() {
    super(new long[] {1, 0, -1, 0, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 7, 9, 12});
  }
}
