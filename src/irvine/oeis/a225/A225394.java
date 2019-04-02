package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225394 Expansion of 1/(1 - x - x^2 + x^7 - x^9).
 * @author Sean A. Irvine
 */
public class A225394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225394() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 20, 32});
  }
}
