package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085789 Partial sums of n 3-spaced triangular numbers beginning with t(2), e.g., a(2) = t(2) + t(5) = 3 + 15 = 18.
 * @author Sean A. Irvine
 */
public class A085789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085789() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 54, 120});
  }
}
