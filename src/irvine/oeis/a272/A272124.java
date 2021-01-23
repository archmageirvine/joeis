package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272124 a(n) = 12*n^4 + 16*n^3 + 10*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A272124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272124() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 43, 369, 1507, 4273});
  }
}
