package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029004.
 * @author Sean A. Irvine
 */
public class A029004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029004() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 1, 0, 0, 0, 1, -1, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 5, 7, 8, 10, 12, 15, 17, 21, 24, 28, 32});
  }
}
