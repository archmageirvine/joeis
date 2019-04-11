package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097401 Largest achievable determinant of <code>a 3</code> X 3 matrix whose elements are 9 distinct nonnegative integers chosen from the range <code>0..n</code>.
 * @author Sean A. Irvine
 */
public class A097401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097401() {
    super(new long[] {-1, 4, -6, 4}, new long[] {332, 528, 796, 1148});
  }
}
