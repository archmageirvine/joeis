package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162675 Number of different fixed (possibly) disconnected pentominoes bounded (not necessarily tightly) by an <code>n*n</code> square.
 * @author Sean A. Irvine
 */
public class A162675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162675() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 114, 2910, 26490, 145110, 582540, 1891764, 5263020});
  }
}
