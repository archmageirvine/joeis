package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272134 a(n) = n*(15*n^2 - 15*n + 4).
 * @author Sean A. Irvine
 */
public class A272134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272134() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 68, 282});
  }
}
