package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221364 The simple continued fraction expansion of F(x) := product {n = 0..inf} (1 - x^(4*n+3))/(1 - x^(4*n+1)) when x = 1/2*(3 - sqrt(5)).
 * @author Sean A. Irvine
 */
public class A221364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221364() {
    super(new long[] {1, 0, -4, 0, 4, 0}, new long[] {1, 1, 1, 5, 1, 16});
  }
}
