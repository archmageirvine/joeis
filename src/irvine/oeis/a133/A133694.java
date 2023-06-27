package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133694 a(n) = (3*n^2 + 3*n - 4)/2.
 * @author Sean A. Irvine
 */
public class A133694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133694() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 7, 16});
  }
}
