package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036827 a(n) = 26+2^(n+1)*(-13+9*n-3*n^2+n^3).
 * @author Sean A. Irvine
 */
public class A036827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036827() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {0, 2, 34, 250, 1274});
  }
}
