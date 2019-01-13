package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020702.
 * @author Sean A. Irvine
 */
public class A020702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020702() {
    super(new long[] {-1, 1, 1, 0, -1, 0, 0, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 6, 8, 10, 13, 16, 21});
  }
}
