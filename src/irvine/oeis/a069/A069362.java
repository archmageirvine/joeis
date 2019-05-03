package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069362 Number of <code>4 X n</code> binary arrays with a path of adjacent <code>1</code>'s from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069362() {
    super(new long[] {-128, -1272, 1264, -378, 35}, new long[] {1, 41, 1041, 22193, 433809});
  }
}
