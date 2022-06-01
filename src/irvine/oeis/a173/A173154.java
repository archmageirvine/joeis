package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173154 a(n) = n^3/6 + 3*n^2/4 + 7*n/3 + 7/8 + (-1)^n/8.
 * @author Sean A. Irvine
 */
public class A173154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173154() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 10, 19, 33});
  }
}
