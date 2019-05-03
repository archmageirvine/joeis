package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122365 The <code>(1,6)-entry</code> of the matrix <code>M^n</code>, where M is the <code>6 X 6</code> matrix <code>{{1, 1, 1, 1, 1, 1},{1, 0, 0, 0, 1, 0},{1, 0, 0, 1, 0, 0},{1, 0, 1, 0, 0, 0},{1, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}}</code>.
 * @author Sean A. Irvine
 */
public class A122365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122365() {
    super(new long[] {-1, 4, 2}, new long[] {0, 1, 1});
  }
}
