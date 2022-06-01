package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050403 Partial sums of A051877.
 * @author Sean A. Irvine
 */
public class A050403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050403() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 13, 70, 252, 714, 1722, 3696});
  }
}
