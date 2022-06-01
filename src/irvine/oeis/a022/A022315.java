package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022315 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 0 and a(1) = 10.
 * @author Sean A. Irvine
 */
public class A022315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022315() {
    super(new long[] {-1, 0, 2}, new long[] {0, 10, 11});
  }
}
