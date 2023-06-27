package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109815 n^2 followed by n^3 followed by n.
 * @author Sean A. Irvine
 */
public class A109815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109815() {
    super(1, new long[] {-1, 0, 0, 4, 0, 0, -6, 0, 0, 4, 0, 0}, new long[] {1, 1, 1, 4, 8, 2, 9, 27, 3, 16, 64, 4});
  }
}
