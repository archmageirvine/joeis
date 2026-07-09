package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109525 Expansion of g.f.: x*(2 - 4*x^3 - 5*x^4 - 3*x^5 - 2*x^6)/((1 - x)*(1 + x)*(1 + x^2)*(1 - x - x^2 - x^3 - x^4)).
 * @author Sean A. Irvine
 */
public class A109525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109525() {
    super(new long[] {-1, -1, -1, -1, 2, 1, 1, 1}, new long[] {0, 2, 2, 4, 4, 9, 16, 31});
  }
}
