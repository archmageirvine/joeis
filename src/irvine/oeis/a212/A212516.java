package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212516 Number of (w,x,y,z) with all terms in {1,...,n} and w&gt;2x and y&lt;3z.
 * @author Sean A. Irvine
 */
public class A212516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212516() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 8, 28, 88, 186, 378, 660, 1104, 1700, 2575, 3660, 5148, 6972, 9310});
  }
}
