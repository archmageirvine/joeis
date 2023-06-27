package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097401 Largest achievable determinant of a 3 X 3 matrix whose elements are 9 distinct nonnegative integers chosen from the range 0..n.
 * @author Sean A. Irvine
 */
public class A097401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097401() {
    super(8, new long[] {-1, 4, -6, 4}, new long[] {332, 528, 796, 1148});
  }
}
