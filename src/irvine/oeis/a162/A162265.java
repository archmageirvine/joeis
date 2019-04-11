package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162265 <code>a(n) = (2*n^3 + 5*n^2 - 5*n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162265() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 42, 94});
  }
}
