package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029160.
 * @author Sean A. Irvine
 */
public class A029160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029160() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 1, 0, -1, -1, 0, 2, 0, -1, -1, 0, 1, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 4, 6, 6, 7, 7, 9, 9, 10, 12, 12, 13});
  }
}
