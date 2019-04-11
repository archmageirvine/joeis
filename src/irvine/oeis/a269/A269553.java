package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269553 Expansion of <code>(-5*x^2 + 138*x + 3)/(x^3 - 99*x^2 + 99*x - 1)</code>.
 * @author Sean A. Irvine
 */
public class A269553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269553() {
    super(new long[] {1, -99, 99}, new long[] {-3, -435, -42763});
  }
}
