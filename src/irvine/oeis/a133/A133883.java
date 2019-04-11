package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133883 <code>a(n) =</code> binomial(n+3,n) <code>mod 3^2</code>.
 * @author Sean A. Irvine
 */
public class A133883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133883() {
    super(new long[] {1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1, -1, 0, 1}, new long[] {1, 4, 1, 2, 8, 2, 3, 3, 3, 4, 7, 4, 5, 2, 5, 6, 6, 6, 7, 1, 7, 8, 5, 8, 0});
  }
}
