package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216605 Expansion of g.f. (6 + 5*x - 20*x^2 - 12*x^3 + 12*x^4 + 3*x^5)/(1 + x - 5*x^2 - 4*x^3 + 6*x^4 + 3*x^5 - x^6).
 * @author Sean A. Irvine
 */
public class A216605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216605() {
    super(new long[] {1, -3, -6, 4, 5, -1}, new long[] {6, -1, 11, -4, 31, -16});
  }
}
