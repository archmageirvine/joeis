package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152728 a(n) + a(n+1) + a(n+2) = n^3.
 * @author Sean A. Irvine
 */
public class A152728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152728() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 0, 1, 7, 19});
  }
}
