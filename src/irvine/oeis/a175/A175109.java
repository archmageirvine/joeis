package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175109.
 * @author Sean A. Irvine
 */
public class A175109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175109() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 13, 63, 171, 365});
  }
}
