package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107332 The <code>(1,3)-entry</code> of the matrix <code>M^n</code>, where M is the <code>5x5</code> matrix <code>[[0,1,0,0,0],[0,0,1,0,0],[0,0,0,1,0],[0,0,0,0,1],[1,0,-1,1,1]]</code>.
 * @author Sean A. Irvine
 */
public class A107332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107332() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 1, 0, 0, -1});
  }
}
