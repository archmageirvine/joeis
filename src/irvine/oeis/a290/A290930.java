package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290930 p-INVERT of the positive integers, where <code>p(S) = (1 - S^2)(1 - 2*S^2)</code>.
 * @author Sean A. Irvine
 */
public class A290930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290930() {
    super(new long[] {-1, 8, -25, 44, -54, 44, -25, 8}, new long[] {0, 3, 12, 37, 116, 372, 1188, 3763});
  }
}
