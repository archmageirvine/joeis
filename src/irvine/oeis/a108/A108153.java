package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108153 a(n) = 3*a(n-1) + 2*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A108153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108153() {
    super(new long[] {1, 2, 3}, new long[] {0, 1, 3});
  }
}
