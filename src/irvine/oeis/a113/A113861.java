package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113861 a(n) = (1/9)*((6*n - 7)*2^(n-1) - (-1)^n).
 * @author Sean A. Irvine
 */
public class A113861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113861() {
    super(new long[] {-4, 0, 3}, new long[] {0, 1, 5});
  }
}
