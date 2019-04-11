package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243006 G.f.: <code>(x - 3*x^2 + 12*x^3 + 6*x^4 - x^5) / ((1 - x) * (1 + x^2))^2</code>.
 * @author Sean A. Irvine
 */
public class A243006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243006() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, -1, 7, 27, 25});
  }
}
