package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260710 Expansion of 1/(1 - x - x^2 - x^4 + x^5 + x^7).
 * @author Sean A. Irvine
 */
public class A260710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260710() {
    super(new long[] {-1, 0, -1, 1, 0, 1, 1}, new long[] {1, 1, 2, 3, 6, 9, 16});
  }
}
