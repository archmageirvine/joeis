package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080239 Antidiagonal sums of triangle A035317.
 * @author Sean A. Irvine
 */
public class A080239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080239() {
    super(new long[] {-1, -1, 1, 0, 1, 1}, new long[] {1, 1, 2, 3, 6, 9});
  }
}
