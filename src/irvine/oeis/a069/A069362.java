package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069362 Number of 4 X n binary arrays with a path of adjacent 1's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069362() {
    super(1, new long[] {-128, -1272, 1264, -378, 35}, new long[] {1, 41, 1041, 22193, 433809});
  }
}
