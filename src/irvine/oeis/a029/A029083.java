package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029083.
 * @author Sean A. Irvine
 */
public class A029083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029083() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10, 11, 13, 14, 16, 17, 19, 20});
  }
}
