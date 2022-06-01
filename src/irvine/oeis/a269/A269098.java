package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269098 Expansion of (1 + 2*x + 3*x^2 + x^3 + x^5)/(1 - x^3)^2.
 * @author Sean A. Irvine
 */
public class A269098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269098() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 3, 4, 7});
  }
}
