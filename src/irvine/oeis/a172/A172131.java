package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172131.
 * @author Sean A. Irvine
 */
public class A172131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172131() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 2, 4, 8, 13, 20, 29, 40, 53});
  }
}
