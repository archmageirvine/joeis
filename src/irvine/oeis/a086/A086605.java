package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086605 a(n) = 9*n^3 - 18*n^2 + 10*n.
 * @author Sean A. Irvine
 */
public class A086605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086605() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 20, 111});
  }
}
