package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122595 Expansion of <code>x/(1 - 3*x + x^2 + x^3 - x^4)</code>.
 * @author Sean A. Irvine
 */
public class A122595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122595() {
    super(new long[] {1, -1, -1, 3}, new long[] {1, 3, 8, 20});
  }
}
