package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036405 a(n) = ceiling(n^2/7).
 * @author Sean A. Irvine
 */
public class A036405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036405() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 1, 2, 3, 4, 6, 7, 10});
  }
}
