package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122518 G.f.: 1/(1 -2 x^3 - x^4 + x^5).
 * @author Sean A. Irvine
 */
public class A122518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122518() {
    super(new long[] {-1, 1, 2, 0, 0}, new long[] {1, 0, 0, 2, 1});
  }
}
