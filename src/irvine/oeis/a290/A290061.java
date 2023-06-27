package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290061 a(n) = (1/24)*(n + 3)*(3*n^3 + 5*n^2 - 6*n + 16).
 * @author Sean A. Irvine
 */
public class A290061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290061() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {3, 10, 31, 77, 162});
  }
}
