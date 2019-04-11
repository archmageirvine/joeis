package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113531 <code>a(n) = 1 + 2*n + 3*n^2 + 4*n^3 + 5*n^4 + 6*n^5</code>.
 * @author Sean A. Irvine
 */
public class A113531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113531() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 321, 2005, 7737, 22461});
  }
}
