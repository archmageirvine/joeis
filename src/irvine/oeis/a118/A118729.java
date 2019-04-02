package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118729 Infinite square array which contains the 8 numbers 4*r^2 - 3*r, 4*r^2 - 2*r, ..., 4*r^2 + 4*r in row r.
 * @author Sean A. Irvine
 */
public class A118729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118729() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
