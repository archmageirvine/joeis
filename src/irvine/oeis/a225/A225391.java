package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225391 Expansion of 1/(1 - x - x^2 - x^6 + x^8).
 * @author Sean A. Irvine
 */
public class A225391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225391() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 14, 23});
  }
}
