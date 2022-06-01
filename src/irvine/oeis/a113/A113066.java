package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113066 Expansion of (1 + x)^2/((1 + x + x^2)*(1 + 3*x + x^2)).
 * @author Sean A. Irvine
 */
public class A113066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113066() {
    super(new long[] {-1, -4, -5, -4}, new long[] {1, -2, 4, -10});
  }
}
