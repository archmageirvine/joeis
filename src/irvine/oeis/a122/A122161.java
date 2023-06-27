package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122161 Expansion of  x*(1 - 3*x + x^2) / (1 - x - 2*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A122161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122161() {
    super(1, new long[] {-1, 2, 1}, new long[] {1, -2, 1});
  }
}
