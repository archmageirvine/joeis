package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289231 Number of nonequivalent ways to select 4 disjoint point triples from an n X n X n triangular point grid, each point triple forming a 2 X 2 X 2 triangle.
 * @author Sean A. Irvine
 */
public class A289231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289231() {
    super(new long[] {1, -4, 4, 1, 2, -8, -5, 14, 1, -1, -14, 5, 8, -2, -1, -4, 4}, new long[] {0, 4, 159, 1644, 9548, 38872, 125367, 342831, 829052, 1822785, 3714519, 7113539, 12935256, 22511616, 37728563, 61194888, 96446684});
  }
}
