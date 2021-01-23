package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152813 a(n) = 2*n^2 + 10*n + 3.
 * @author Sean A. Irvine
 */
public class A152813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152813() {
    super(new long[] {1, -3, 3}, new long[] {3, 15, 31});
  }
}
