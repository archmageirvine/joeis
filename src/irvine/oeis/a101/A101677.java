package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101677 a(n) = a(n-1) - 2*a(n-2) + 2*a(n-3) - 2*a(n-4) + 2*a(n-5) - a(n-6).
 * @author Sean A. Irvine
 */
public class A101677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101677() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 1, -1, -2, -2, -2});
  }
}
