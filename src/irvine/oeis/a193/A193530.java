package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193530 Expansion of (1 - 2*x - 2*x^2 + 3*x^3 + x^5)/((1-x)*(1-2*x-x^2)*(1-2*x^2-x^4)).
 * @author Sean A. Irvine
 */
public class A193530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193530() {
    super(new long[] {1, 1, -1, 3, -7, 1, 3}, new long[] {1, 1, 2, 3, 7, 13, 31});
  }
}
