package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180031 Number of n-move paths on a 3 X 3 chessboard of a queen starting or ending in the central square.
 * @author Sean A. Irvine
 */
public class A180031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180031() {
    super(new long[] {8, 5}, new long[] {1, 8});
  }
}
