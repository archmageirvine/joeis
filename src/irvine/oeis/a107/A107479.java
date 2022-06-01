package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107479 a(n) = a(n-2) + a(n-3) + a(n-4) + a(n-5) + a(n-6) + a(n-7).
 * @author Sean A. Irvine
 */
public class A107479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107479() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
