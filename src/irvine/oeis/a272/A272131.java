package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272131 a(n) = 384*n^3 - 1184*n^2 + 1228*n - 427.
 * @author Sean A. Irvine
 */
public class A272131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272131() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-427, 1, 365, 2969});
  }
}
