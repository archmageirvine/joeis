package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268644 a(n) = 4*n^3 - 3*n^2 - 2*n - 1.
 * @author Sean A. Irvine
 */
public class A268644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268644() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, 15, 74});
  }
}
