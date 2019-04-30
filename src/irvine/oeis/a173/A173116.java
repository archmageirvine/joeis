package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173116 <code>a(n) = sinh(2*arcsinh(n))^2 = 4*n^2*(n^2 + 1)</code>.
 * @author Sean A. Irvine
 */
public class A173116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173116() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 8, 80, 360, 1088});
  }
}
