package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276351 a(n) = 2*(3 + 2 n + 3 n^2 + 3 n^3 + 3 n^4 + n^5 + n^6).
 * @author Sean A. Irvine
 */
public class A276351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276351() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 32, 374, 2664, 12278, 42176, 118182});
  }
}
