package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232896 a(n) = 3*a(n-1) - 2*a(n-2) - a(n-3) + a(n-4), where a(1) = 1, a(2) = 3, a(3) = 5, a(4) = 8.
 * @author Sean A. Irvine
 */
public class A232896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232896() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {1, 3, 5, 8});
  }
}
