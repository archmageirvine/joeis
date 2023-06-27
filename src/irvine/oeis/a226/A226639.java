package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226639 a(n) = n^4/8 + (5*n^3)/12 - n^2/8 - (5*n)/12 + 1.
 * @author Sean A. Irvine
 */
public class A226639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226639() {
    super(-1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 1, 5, 20});
  }
}
