package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225972.
 * @author Sean A. Irvine
 */
public class A225972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225972() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 6, 14, 32});
  }
}
