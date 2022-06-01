package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019493 a(n) = 3*a(n-1) - 4*a(n-3) + a(n-6).
 * @author Sean A. Irvine
 */
public class A019493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019493() {
    super(new long[] {1, 0, 0, -4, 0, 3}, new long[] {4, 9, 20, 44, 96, 209});
  }
}
