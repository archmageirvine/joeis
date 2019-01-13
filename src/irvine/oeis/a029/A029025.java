package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029025.
 * @author Sean A. Irvine
 */
public class A029025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029025() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 1, 0, -2, 0, 1, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 6, 7, 9, 10, 12, 13, 15, 16, 19, 21, 25, 27});
  }
}
