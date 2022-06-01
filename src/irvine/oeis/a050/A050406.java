package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050406 Partial sums of A051880.
 * @author Sean A. Irvine
 */
public class A050406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050406() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 16, 91, 336, 966, 2352, 5082});
  }
}
