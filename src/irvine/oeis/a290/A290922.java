package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290922 p-INVERT of the positive integers, where p(S) = 1 - S - 2*S^2.
 * @author Sean A. Irvine
 */
public class A290922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290922() {
    super(new long[] {-1, 5, -6, 5}, new long[] {1, 5, 20, 75});
  }
}
