package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176476 Partial sums of A012814.
 * @author Sean A. Irvine
 */
public class A176476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176476() {
    super(new long[] {-1, 5, -9, 6}, new long[] {0, 1, 6, 27});
  }
}
