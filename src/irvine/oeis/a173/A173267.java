package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173267 a(n) = 121*n^2 + n.
 * @author Sean A. Irvine
 */
public class A173267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173267() {
    super(1, new long[] {1, -3, 3}, new long[] {122, 486, 1092});
  }
}
