package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122789 The <code>(1</code>,4)-entry in the matrix M^n, where M is the 4 X 4 matrix <code>{{0, -1, -1, 1}, {1, -1, 0, 0}, {0, 1, 1, 0}, {0, 0, 1, 1 }}</code>.
 * @author Sean A. Irvine
 */
public class A122789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122789() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 1, 0});
  }
}
