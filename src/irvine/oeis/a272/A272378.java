package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272378 a(n) = n*(6*n^2 - 8*n + 3).
 * @author Sean A. Irvine
 */
public class A272378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272378() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 22, 99});
  }
}
