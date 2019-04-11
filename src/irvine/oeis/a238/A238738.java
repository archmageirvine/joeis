package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238738 Expansion of <code>(1 + 2*x + 2*x^2)/(1 - x - 2*x^3 + 2*x^4 + x^6 - x^7)</code>.
 * @author Sean A. Irvine
 */
public class A238738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238738() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 3, 5, 7, 11, 15, 18});
  }
}
