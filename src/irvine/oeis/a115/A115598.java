package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115598.
 * @author Sean A. Irvine
 */
public class A115598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115598() {
    super(new long[] {1, -7, 7}, new long[] {1, 8, 49});
  }
}
