package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036404 a(n) = ceiling(n^2/5).
 * @author Sean A. Irvine
 */
public class A036404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036404() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 1, 1, 2, 4, 5, 8});
  }
}
