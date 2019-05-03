package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290913 p-INVERT of the positive integers, where <code>p(S) = 1 - 7*S^2</code>.
 * @author Sean A. Irvine
 */
public class A290913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290913() {
    super(new long[] {-1, 4, 1, 4}, new long[] {0, 7, 28, 119});
  }
}
