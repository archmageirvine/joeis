package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290775.
 * @author Sean A. Irvine
 */
public class A290775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290775() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 2, 24, 138, 532, 1596});
  }
}
