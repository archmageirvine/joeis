package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178420 Partial sums of floor(2^n/3).
 * @author Sean A. Irvine
 */
public class A178420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178420() {
    super(new long[] {2, -3, -1, 3}, new long[] {0, 1, 3, 8});
  }
}
