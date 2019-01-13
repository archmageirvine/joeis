package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029026.
 * @author Sean A. Irvine
 */
public class A029026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029026() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 1, -1, -1, 2, -1, -1, 1, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 6, 6, 8, 9, 11, 12, 14, 15, 18, 19, 22, 24, 27, 29});
  }
}
