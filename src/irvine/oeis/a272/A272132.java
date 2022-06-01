package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272132 a(n) = 6144*n^4 - 29184*n^3 + 52416*n^2 - 41840*n + 12465.
 * @author Sean A. Irvine
 */
public class A272132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272132() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12465, 1, 3281, 68385, 388849});
  }
}
