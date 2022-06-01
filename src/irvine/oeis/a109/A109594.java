package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109594 n followed by n^3 followed by n^2.
 * @author Sean A. Irvine
 */
public class A109594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109594() {
    super(new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 2, 8, 4, 3, 27, 9, 4, 64, 16});
  }
}
