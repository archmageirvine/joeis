package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114553 a(n) = 25*a(n-2) + 48*a(n-3) with a(0) = 0, a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A114553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114553() {
    super(new long[] {48, 25, 0}, new long[] {0, 1, 1});
  }
}
