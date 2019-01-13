package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101990.
 * @author Sean A. Irvine
 */
public class A101990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101990() {
    super(new long[] {9, -3, 3}, new long[] {1, 1, 9});
  }
}
