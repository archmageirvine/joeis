package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225499 Expansion of 1/(1 - x + x^2 - x^3 - x^6 - x^9 + x^10 - x^11 + x^12).
 * @author Sean A. Irvine
 */
public class A225499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225499() {
    super(new long[] {-1, 1, -1, 1, 0, 0, 1, 0, 0, 1, -1, 1}, new long[] {1, 1, 0, 0, 1, 1, 1, 2, 2, 2, 3, 4});
  }
}
