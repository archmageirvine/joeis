package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221366 The simple continued fraction expansion of F(x) := product {n = 0..inf} (1 - x^(4*n+3))/(1 - x^(4*n+1)) when x = 1/2*(7 - 3*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A221366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221366() {
    super(new long[] {1, 0, -8, 0, 8, 0}, new long[] {1, 5, 1, 45, 1, 320});
  }
}
