package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221365 The simple continued fraction expansion of F(x) := product {n = 0..inf} (1 - x^(4*n+3))/(1 - x^(4*n+1)) when x = 1/2*(5 - sqrt(21)).
 * @author Sean A. Irvine
 */
public class A221365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221365() {
    super(new long[] {1, 0, -6, 0, 6, 0}, new long[] {1, 3, 1, 21, 1, 108});
  }
}
