package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089950 Partial sums of A001652.
 * @author Sean A. Irvine
 */
public class A089950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089950() {
    super(new long[] {-1, 8, -14, 8}, new long[] {0, 3, 23, 142});
  }
}
