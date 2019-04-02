package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245941 (16n^6 - 24n^5 + 2n^4 + 11n^3 - 6n^2 + n) / 6.
 * @author Sean A. Irvine
 */
public class A245941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245941() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 59, 1040, 7014, 29580, 94105});
  }
}
