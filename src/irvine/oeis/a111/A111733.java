package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111733 a(n) = a(n-1) + a(n-2) + 7 where a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A111733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111733() {
    super(new long[] {-1, 0, 2}, new long[] {1, 1, 9});
  }
}
