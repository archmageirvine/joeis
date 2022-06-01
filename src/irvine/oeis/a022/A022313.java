package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022313 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 0 and a(1) = 8.
 * @author Sean A. Irvine
 */
public class A022313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022313() {
    super(new long[] {-1, 0, 2}, new long[] {0, 8, 9});
  }
}
