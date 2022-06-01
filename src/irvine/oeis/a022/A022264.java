package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022264 a(n) = n*(7*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022264() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 13});
  }
}
