package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110294 a(2*n) = A028230(n), a(2*n+1) = -A067900(n+1).
 * @author Sean A. Irvine
 */
public class A110294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110294() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, -8, 15, -112});
  }
}
