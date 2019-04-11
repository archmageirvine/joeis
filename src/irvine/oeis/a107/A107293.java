package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107293 The <code>(1</code>,1)-entry of the matrix M^n, where M is the 5 X 5 matrix <code>[[0,1,0,0,0],[0,0,1,0,0], [0,0,0,1,0], [0,0,0,0,1], [1,0,-1,1,1]]</code>.
 * @author Sean A. Irvine
 */
public class A107293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107293() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
