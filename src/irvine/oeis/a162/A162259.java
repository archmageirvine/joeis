package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162259 <code>a(n) = (2*n^3 + 5*n^2 - 17*n)/2</code>.
 * @author Sean A. Irvine
 */
public class A162259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162259() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-5, 1, 24, 70});
  }
}
