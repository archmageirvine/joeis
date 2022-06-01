package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278706 a(n) = a(n-1) + a(n-3) + a(n-5) - a(n-6), a(0) = a(1) = a(2) = 1, a(3) = 2, a(4) = 3, a(5) = 5.
 * @author Sean A. Irvine
 */
public class A278706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278706() {
    super(new long[] {-1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 5});
  }
}
