package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162258 a(n) = (2*n^3 + 5*n^2 - 9*n)/2.
 * @author Sean A. Irvine
 */
public class A162258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162258() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 9, 36, 86});
  }
}
