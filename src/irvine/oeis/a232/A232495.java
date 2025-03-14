package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232495 a(n) = 9*n^3/2 - 21*n^2/2 + 8*n - 4.
 * @author Sean A. Irvine
 */
public class A232495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232495() {
    super(2, new long[] {-1, 4, -6, 4}, new long[] {6, 47, 148, 336});
  }
}
