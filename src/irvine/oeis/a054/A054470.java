package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054470 Partial sums of A054469.
 * @author Sean A. Irvine
 */
public class A054470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054470() {
    super(new long[] {1, -5, 8, 1, -20, 29, -20, 7}, new long[] {1, 8, 36, 121, 339, 838, 1891, 3983});
  }
}
