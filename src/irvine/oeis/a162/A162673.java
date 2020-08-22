package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162673 Number of different fixed (possibly) disconnected trominoes bounded (not necessarily tightly) by an n*n square.
 * @author Sean A. Irvine
 */
public class A162673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162673() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 48, 204, 580});
  }
}
