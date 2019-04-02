package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162254 a(n) = (2*n^3 + 5*n^2 + n)/2.
 * @author Sean A. Irvine
 */
public class A162254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162254() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 19, 51, 106});
  }
}
