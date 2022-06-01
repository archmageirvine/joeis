package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272039 a(n) = 10*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A272039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272039() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 49});
  }
}
