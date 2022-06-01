package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109614 n^3 followed by n followed by n^2.
 * @author Sean A. Irvine
 */
public class A109614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109614() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 8, 2, 4, 27, 3, 9, 64, 4, 16});
  }
}
