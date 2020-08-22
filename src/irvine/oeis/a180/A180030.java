package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180030 Number of n-move paths on a 3 X 3 chessboard of a queen starting or ending in a corner or side square.
 * @author Sean A. Irvine
 */
public class A180030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180030() {
    super(new long[] {8, 5}, new long[] {1, 6});
  }
}
