package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290913 p-INVERT of the positive integers, where p(S) = 1 - 7*S^2.
 * @author Sean A. Irvine
 */
public class A290913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290913() {
    super(new long[] {-1, 4, 1, 4}, new long[] {0, 7, 28, 119});
  }
}
