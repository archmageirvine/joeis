package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122789 The <code>(1,4)-entry</code> in the matrix <code>M^n</code>, where M is the <code>4 X 4</code> matrix <code>{{0, -1, -1, 1}, {1, -1, 0, 0}, {0, 1, 1, 0}, {0, 0, 1, 1 }}</code>.
 * @author Sean A. Irvine
 */
public class A122789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122789() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 1, 0});
  }
}
