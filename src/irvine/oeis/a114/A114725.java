package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114725 The first entry of the vector <code>v[n]=Mv[n-1]</code>, where M is the <code>6 X 6</code> matrix <code>[[0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1], [1, 5, 10, 10, 5, 1]]</code> and <code>v[0]</code> is the column vector <code>[0, 1, 1, 2, 3, 5]</code>.
 * @author Sean A. Irvine
 */
public class A114725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114725() {
    super(new long[] {1, 5, 10, 10, 5, 1}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
