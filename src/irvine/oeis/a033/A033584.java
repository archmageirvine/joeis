package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033584 a(n) = 11*n^2.
 * @author Sean A. Irvine
 */
public class A033584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033584() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 44});
  }
}
