package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156002 Partial sums of round(7^n/9).
 * @author Sean A. Irvine
 */
public class A156002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156002() {
    super(new long[] {7, -8, 1, -7, 8}, new long[] {0, 1, 6, 44, 311});
  }
}
