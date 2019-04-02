package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147592 Expansion of 1/(1 + x - x^2 - 3 x^3 - x^4 + x^5 + x^6).
 * @author Sean A. Irvine
 */
public class A147592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147592() {
    super(new long[] {-1, -1, 1, 3, 1, -1}, new long[] {1, -1, 2, 0, 0, 4});
  }
}
