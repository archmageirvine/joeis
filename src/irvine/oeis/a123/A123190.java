package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123190 Sum of the entries of the first row of the matrix M^n, where M is the 4 X 4 matrix <code>[[ -1, 3, -3, 1 ], [ 3, -6, 3, 0 ], [ -3, 0, 3, 0 ], [ 1, 4, 1, 0 ]]</code>.
 * @author Sean A. Irvine
 */
public class A123190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123190() {
    super(new long[] {-108, 30, 34, -4}, new long[] {1, 0, 6, -6});
  }
}
