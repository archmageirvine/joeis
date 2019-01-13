package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287893.
 * @author Sean A. Irvine
 */
public class A287893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287893() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 1, 2, 3, 5, 7, 8, 11, 13});
  }
}
