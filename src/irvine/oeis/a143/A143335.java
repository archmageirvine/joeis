package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143335 Expansion of (1 - 2*x^3 - x^4 - 2*x^5 - x^6 - x^7 - x^8 + 2*x^9)/(1 + x - x^3 - x^4 - x^5 - x^6 - x^7 + x^9 + x^10).
 * @author Sean A. Irvine
 */
public class A143335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143335() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, -1, 1, -2, 1, -2, 0, -1, -3, 2});
  }
}
