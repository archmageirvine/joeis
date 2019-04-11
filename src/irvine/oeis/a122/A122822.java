package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122822 The <code>(1,4)</code> entry in the matrix M^n, where M is the 4 X 4 matrix <code>[[0,-1,1,0],[0,0,-1,1],[1,1,1,0],[0,1,1,1]]</code>.
 * @author Sean A. Irvine
 */
public class A122822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122822() {
    super(new long[] {-3, 1, 0, 2}, new long[] {0, 0, -1, 0});
  }
}
