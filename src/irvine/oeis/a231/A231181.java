package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231181 Expansion of 1/(1 - x - 4*x^2 + 3*x^3 + 3*x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A231181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231181() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {1, 1, 5, 6, 20});
  }
}
