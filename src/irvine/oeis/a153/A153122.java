package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153122 G.f.: 1/p(x) where p(x)=x^5 + 2x^4 - 2x^3 - x^2 + 2x - 1.
 * @author Sean A. Irvine
 */
public class A153122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153122() {
    super(new long[] {1, -2, 1, 2, -2}, new long[] {1, -2, 6, -15, 38});
  }
}
