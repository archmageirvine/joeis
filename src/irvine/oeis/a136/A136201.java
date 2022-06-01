package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136201 a(n) = 2*a(n-1) + 4*a(n-2) - 6*a(n-3) - 3*a(n-4).
 * @author Sean A. Irvine
 */
public class A136201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136201() {
    super(new long[] {-3, -6, 4, 2}, new long[] {0, 0, 0, 1});
  }
}
