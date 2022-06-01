package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270867 a(n) = n^3 + 2*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A270867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270867() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 25, 58});
  }
}
