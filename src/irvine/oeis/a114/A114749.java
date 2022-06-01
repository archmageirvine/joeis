package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114749 a(n) = a(n-1) + 4*a(n-2) + 6*a(n-3) + 4*a(n-4) + a(n-5).
 * @author Sean A. Irvine
 */
public class A114749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114749() {
    super(new long[] {1, 4, 6, 4, 1}, new long[] {0, 1, 1, 2, 3});
  }
}
