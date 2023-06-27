package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093406 a(n) = 4*a(n-1) - 6*a(n-2) + 4*a(n-3) + a(n-4).
 * @author Sean A. Irvine
 */
public class A093406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093406() {
    super(1, new long[] {1, 4, -6, 4}, new long[] {1, 3, 11, 31});
  }
}
