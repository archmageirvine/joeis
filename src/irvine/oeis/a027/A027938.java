package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027938 a(n) = T(2n, n+2), T given by A027935.
 * @author Sean A. Irvine
 */
public class A027938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027938() {
    super(new long[] {-1, 7, -19, 26, -19, 7}, new long[] {1, 16, 92, 365, 1204, 3588});
  }
}
