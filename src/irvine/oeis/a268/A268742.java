package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268742 Expansion of x*(1 + x + 18*x^2 + 10*x^3 - x^4 + 11*x^5 + 18*x^6 + 2*x^7) / (1 - x - 2*x^4 + 2*x^5 + x^8 - x^9).
 * @author Sean A. Irvine
 */
public class A268742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268742() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 2, 20, 30, 31, 44, 98, 120});
  }
}
