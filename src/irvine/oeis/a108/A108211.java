package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108211 a(n) = 16*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A108211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108211() {
    super(1, new long[] {1, -3, 3}, new long[] {17, 65, 145});
  }
}
