package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122161 Expansion of <code> x*(1 - 3*x + x^2) / (1 - x - 2*x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A122161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122161() {
    super(new long[] {-1, 2, 1}, new long[] {1, -2, 1});
  }
}
