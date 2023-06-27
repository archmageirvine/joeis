package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178827 Partial sums of floor(8^n/9)/7.
 * @author Sean A. Irvine
 */
public class A178827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178827() {
    super(1, new long[] {8, -9, -7, 9}, new long[] {0, 1, 9, 74});
  }
}
