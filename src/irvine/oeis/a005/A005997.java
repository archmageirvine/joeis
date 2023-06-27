package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005997 Number of paraffins.
 * @author Sean A. Irvine
 */
public class A005997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005997() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 10, 20, 39, 63});
  }
}

