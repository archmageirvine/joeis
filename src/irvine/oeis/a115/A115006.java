package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115006 Row 2 of array in A114999.
 * @author Sean A. Irvine
 */
public class A115006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115006() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 8, 16});
  }
}
