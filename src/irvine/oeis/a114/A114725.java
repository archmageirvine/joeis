package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114725 The first entry of the vector v[n]=Mv[n-1], where M is the 6 X 6 matrix [[0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1], [1, 5, 10, 10, 5, 1]] and v[0] is the column vector [0, 1, 1, 2, 3, 5].
 * @author Sean A. Irvine
 */
public class A114725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114725() {
    super(new long[] {1, 5, 10, 10, 5, 1}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
