package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029027.
 * @author Sean A. Irvine
 */
public class A029027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029027() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 0, 1, 0, -2, 0, 1, 0, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 9, 11, 12, 14, 15, 17, 18, 21, 23, 27, 29});
  }
}
