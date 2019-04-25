package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071768 Determinant of the n X n matrix whose element <code>(i,j)</code> equals |i-j| (Mod 3).
 * @author Sean A. Irvine
 */
public class A071768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071768() {
    super(new long[] {1, 1, 1, -1, -1}, new long[] {0, -1, 4, 9, -10});
  }
}
