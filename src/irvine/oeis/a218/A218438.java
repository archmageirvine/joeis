package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218438 G.f.:  1 / ( (1 + x^2 - x^3)^2 * (1 - x - 2*x^2 - x^3) ).
 * @author Sean A. Irvine
 */
public class A218438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218438() {
    super(new long[] {1, 0, -2, -3, 1, 1, 5, 0, 1}, new long[] {1, 1, 1, 6, 12, 19, 48, 110, 218});
  }
}
