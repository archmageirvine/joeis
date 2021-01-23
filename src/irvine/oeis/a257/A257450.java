package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257450 a(n) = 541*(2^n - 1) - 5*n^4 - 30*n^3 - 130*n^2 - 375*n.
 * @author Sean A. Irvine
 */
public class A257450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257450() {
    super(new long[] {-2, 11, -25, 30, -20, 7}, new long[] {1, 33, 277, 1335, 4771, 14193});
  }
}
