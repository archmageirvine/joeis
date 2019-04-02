package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122605 Expansion of -x*(2*x - 1)*(2*x^2 - 1)*(x^3 + 2*x^2 - x - 1)/((x - 1)*(x^2 + x - 1)*(x^4 - 4*x^3 - 4*x^2 + x + 1)).
 * @author Sean A. Irvine
 */
public class A122605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122605() {
    super(new long[] {-1, 4, 6, -10, -5, 6, 1}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
