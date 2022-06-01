package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090197 a(n) = n^3 + 6*n^2 + 6*n + 1.
 * @author Sean A. Irvine
 */
public class A090197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090197() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 45, 100});
  }
}
