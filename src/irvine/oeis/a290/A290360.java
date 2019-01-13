package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290360.
 * @author Sean A. Irvine
 */
public class A290360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290360() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 11, 58, 206, 571});
  }
}
