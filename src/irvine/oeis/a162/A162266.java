package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162266 a(n) = (2*n^3 + 5*n^2 + 21*n)/2.
 * @author Sean A. Irvine
 */
public class A162266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162266() {
    super(new long[] {-1, 4, -6, 4}, new long[] {14, 39, 81, 146});
  }
}
