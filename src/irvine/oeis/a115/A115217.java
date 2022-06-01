package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115217 Diagonal sums of "correlation triangle" for 2^n.
 * @author Sean A. Irvine
 */
public class A115217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115217() {
    super(new long[] {4, -2, -2, -3, 2, 2}, new long[] {1, 2, 6, 13, 30, 62});
  }
}
