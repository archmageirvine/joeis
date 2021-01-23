package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267755 Expansion of (1 + 2*x + x^2 + x^3 + 4*x^4 + 2*x^5)/(1 - x - x^5 + x^6).
 * @author Sean A. Irvine
 */
public class A267755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267755() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 4, 5, 9, 12});
  }
}
