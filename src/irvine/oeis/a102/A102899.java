package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102899 a(n) = ceiling(n/3)^2 - floor(n/3)^2.
 * @author Sean A. Irvine
 */
public class A102899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102899() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 0, 3, 3});
  }
}
