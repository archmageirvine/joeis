package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162674 Number of different fixed (possibly) disconnected tetrominoes bounded (not necessarily tightly) by <code>an n*n</code> square.
 * @author Sean A. Irvine
 */
public class A162674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162674() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 97, 956, 4780, 16745, 46921});
  }
}
