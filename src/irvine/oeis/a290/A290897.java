package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290897 p-INVERT of the positive integers, where p(S) = 1 - S - S^3.
 * @author Sean A. Irvine
 */
public class A290897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290897() {
    super(new long[] {-1, 7, -19, 27, -19, 7}, new long[] {1, 3, 9, 29, 95, 307});
  }
}
