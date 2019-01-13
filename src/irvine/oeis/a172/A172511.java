package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172511.
 * @author Sean A. Irvine
 */
public class A172511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172511() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {1, 1, 2, 7, 35});
  }
}
