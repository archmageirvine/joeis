package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239096 <code>(n^9 + 21*n^5 - 190*n^3 + 168*n)/1260</code>.
 * @author Sean A. Irvine
 */
public class A239096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239096() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 0, 0, 16, 216, 1584, 8096, 32256, 106992, 308352});
  }
}
