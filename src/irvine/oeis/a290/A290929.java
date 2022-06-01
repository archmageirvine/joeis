package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290929 p-INVERT of the positive integers, where p(S) = (1 - S)(1 - S^2).
 * @author Sean A. Irvine
 */
public class A290929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290929() {
    super(new long[] {-1, 7, -18, 23, -18, 7}, new long[] {1, 4, 13, 39, 114, 330});
  }
}
