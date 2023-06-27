package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276805 a(n) = numerator((n^2 + 3*n + 2)/n^3).
 * @author Sean A. Irvine
 */
public class A276805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276805() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0}, new long[] {6, 3, 20, 15, 42, 7, 72, 45, 110, 33, 156, 91, 210, 30, 272, 153, 342, 95, 420, 231, 506, 69, 600, 325});
  }
}
