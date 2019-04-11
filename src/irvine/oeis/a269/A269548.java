package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269548 Expansion of <code>(-7*x^2 + 134*x + 1)/(x^3 - 99*x^2 + 99*x - 1)</code>.
 * @author Sean A. Irvine
 */
public class A269548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269548() {
    super(new long[] {1, -99, 99}, new long[] {-1, -233, -22961});
  }
}
