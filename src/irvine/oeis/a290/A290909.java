package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290909 p-INVERT of the positive integers, where p(S) = 1 - 5*S^2.
 * @author Sean A. Irvine
 */
public class A290909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290909() {
    super(new long[] {-1, 4, -1, 4}, new long[] {0, 5, 20, 75});
  }
}
