package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138188 Expansion of (1 - 2*x - 2*x^2 - x^3)/(1 + x + x^2 - x^3 - x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A138188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138188() {
    super(new long[] {1, 1, 1, -1, -1}, new long[] {1, -3, 0, 3, -5});
  }
}
