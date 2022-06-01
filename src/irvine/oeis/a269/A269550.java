package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269550 Expansion of (-5*x^2 + 228*x - 7)/(x^3 - 99*x^2 + 99*x - 1).
 * @author Sean A. Irvine
 */
public class A269550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269550() {
    super(new long[] {1, -99, 99}, new long[] {7, 465, 45347});
  }
}
