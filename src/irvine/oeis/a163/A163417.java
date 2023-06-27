package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163417 a(n) = 2^(floor((n-1)/2)) - n*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A163417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163417() {
    super(1, new long[] {-2, 6, -5, -1, 3}, new long[] {1, 0, -1, -4, -6});
  }
}
