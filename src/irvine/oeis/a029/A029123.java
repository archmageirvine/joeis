package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029123.
 * @author Sean A. Irvine
 */
public class A029123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029123() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1, -1, 1, -1, 0, 1, -1, 0, 0, -1, 1, 0, -1, 1, -1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 10, 10, 11, 12, 13, 14, 15, 17});
  }
}
