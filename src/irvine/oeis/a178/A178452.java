package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178452 Partial sums of floor(2^n/5).
 * @author Sean A. Irvine
 */
public class A178452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178452() {
    super(1, new long[] {2, -5, 6, -6, 4}, new long[] {0, 0, 1, 4, 10});
  }
}
