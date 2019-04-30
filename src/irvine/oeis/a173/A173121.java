package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173121 <code>a(n) = sinh(2*arccosh(n))^2 = 4*n^2*(n^2 - 1)</code>.
 * @author Sean A. Irvine
 */
public class A173121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173121() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 48, 288, 960});
  }
}
