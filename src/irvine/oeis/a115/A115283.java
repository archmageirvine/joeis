package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115283 Diagonal sums of correlation triangle for <code>3-2*0^n</code>.
 * @author Sean A. Irvine
 */
public class A115283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115283() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 3, 6, 13, 18, 27});
  }
}
