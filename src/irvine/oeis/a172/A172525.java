package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172525 9*n*12345679.
 * @author Sean A. Irvine
 */
public class A172525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172525() {
    super(new long[] {-1, 2}, new long[] {111111111, 222222222});
  }
}
