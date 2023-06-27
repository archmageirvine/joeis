package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027942 a(n) = T(2n+1, n+2), T given by A027935.
 * @author Sean A. Irvine
 */
public class A027942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027942() {
    super(1, new long[] {1, -6, 13, -13, 6}, new long[] {1, 11, 51, 176, 530});
  }
}
