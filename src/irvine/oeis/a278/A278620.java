package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278620 Expansion of <code>x/(1 - 99*x + 99*x^2 - x^3)</code>.
 * @author Sean A. Irvine
 */
public class A278620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278620() {
    super(new long[] {1, -99, 99}, new long[] {0, 1, 99});
  }
}
