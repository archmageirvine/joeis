package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272380 <code>a(n) = n*(120*n^4 - 480*n^3 + 762*n^2 - 556*n + 155)</code>.
 * @author Sean A. Irvine
 */
public class A272380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272380() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 342, 6315, 40492, 157125});
  }
}
