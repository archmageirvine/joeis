package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122595 Expansion of x/(1 - 3*x + x^2 + x^3 - x^4).
 * @author Sean A. Irvine
 */
public class A122595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122595() {
    super(new long[] {1, -1, -1, 3}, new long[] {1, 3, 8, 20});
  }
}
