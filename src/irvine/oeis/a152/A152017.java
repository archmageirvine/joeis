package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152017 a(n) = n^5-n^4-n^3-n^2-n.
 * @author Sean A. Irvine
 */
public class A152017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152017() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, -3, 2, 123, 684, 2345});
  }
}
