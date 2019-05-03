package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107293 The <code>(1,1)-entry</code> of the matrix <code>M^n</code>, where M is the <code>5 X 5</code> matrix <code>[[0,1,0,0,0],[0,0,1,0,0], [0,0,0,1,0], [0,0,0,0,1], [1,0,-1,1,1]]</code>.
 * @author Sean A. Irvine
 */
public class A107293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107293() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
