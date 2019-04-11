package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269549 Expansion of <code>(-x^2 + 298*x - 1)/(x^3 - 99*x^2 + 99*x - 1)</code>.
 * @author Sean A. Irvine
 */
public class A269549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269549() {
    super(new long[] {1, -99, 99}, new long[] {1, -199, -19799});
  }
}
