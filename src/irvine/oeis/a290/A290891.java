package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290891 p-INVERT of the positive integers, where p(S) = 1 - S^3.
 * @author Sean A. Irvine
 */
public class A290891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290891() {
    super(new long[] {-1, 6, -15, 21, -15, 6}, new long[] {0, 0, 1, 6, 21, 57});
  }
}
