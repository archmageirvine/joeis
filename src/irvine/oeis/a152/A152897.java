package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152897 Partial sums of A152896.
 * @author Sean A. Irvine
 */
public class A152897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152897() {
    super(1, new long[] {-1, 6, -16, 23, -18, 7}, new long[] {0, 3, 18, 73, 256, 844});
  }
}
