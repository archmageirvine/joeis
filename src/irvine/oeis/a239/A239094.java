package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239094 <code>a(n) = (5*n^9 - 30*n^7 + 63*n^5 - 50*n^3 + 12*n)/360</code>.
 * @author Sean A. Irvine
 */
public class A239094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239094() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 0, 1, 130, 2446, 21146, 117971, 494732, 1695036, 4992492});
  }
}
