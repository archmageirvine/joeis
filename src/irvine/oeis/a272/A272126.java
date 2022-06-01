package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272126 a(n) = 120*n^3 + 60*n^2 + 2*n + 1.
 * @author Sean A. Irvine
 */
public class A272126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272126() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 183, 1205, 3787});
  }
}
