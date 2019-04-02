package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187004 Expansion of A(x) = (1 + 2*x^2 + 6*x^3 + 9*x^4 + 8*x^5 + 5*x^6) / (1 - x - 2*x^2 - 3*x^3 - 3*x^4 - 2*x^5 - x^6).
 * @author Sean A. Irvine
 */
public class A187004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187004() {
    super(new long[] {1, 2, 3, 3, 2, 1}, new long[] {1, 5, 16, 41, 101, 254});
  }
}
