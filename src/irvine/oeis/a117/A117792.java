package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117792 First entry of the vector (M^n)w, where M is the <code>6x6</code> matrix <code>[[0, 1, 0, 0, 0, 0, ], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1], [1, 0, -1, 0, 1, 1]]</code> and w is the column vector <code>[0, 1, 1, 2, 3, 5]</code>.
 * @author Sean A. Irvine
 */
public class A117792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117792() {
    super(new long[] {1, 0, -1, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
