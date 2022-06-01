package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180510 G.f.: (t^5 + 2*t^4 + t^3 + 2*t^2 + t) / (t^6 + t^5 - 2*t^4 - 5*t^3 - 2*t^2 + t + 1).
 * @author Sean A. Irvine
 */
public class A180510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180510() {
    super(new long[] {-1, -1, 2, 5, 2, -1}, new long[] {0, 1, 1, 2, 7, 5});
  }
}
