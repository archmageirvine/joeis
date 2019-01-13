package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172399.
 * @author Sean A. Irvine
 */
public class A172399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172399() {
    super(new long[] {-1, 0, 0, 0, 0, -1, 2, 2}, new long[] {1, 2, 6, 15, 40, 104, 273, 714});
  }
}
