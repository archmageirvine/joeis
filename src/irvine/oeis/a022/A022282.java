package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022282 a(n) = n*(25*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022282() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 49});
  }
}
