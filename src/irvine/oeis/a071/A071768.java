package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071768 Determinant of the <code>n X n</code> matrix whose element <code>(i,j)</code> equals <code>|i-j| (Mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A071768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071768() {
    super(new long[] {1, 1, 1, -1, -1}, new long[] {0, -1, 4, 9, -10});
  }
}
