package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172085 a(n) = n*(27*n^3 + 22*n^2 - 21*n - 16)/12.
 * @author Sean A. Irvine
 */
public class A172085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172085() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 41, 212, 660});
  }
}
