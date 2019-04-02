package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152811 a(n) = 2*(n^2 + 2*n - 2).
 * @author Sean A. Irvine
 */
public class A152811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152811() {
    super(new long[] {1, -3, 3}, new long[] {2, 12, 26});
  }
}
