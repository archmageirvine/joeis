package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290891 p-INVERT of the positive integers, where <code>p(S) = 1 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A290891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290891() {
    super(new long[] {-1, 6, -15, 21, -15, 6}, new long[] {0, 0, 1, 6, 21, 57});
  }
}
