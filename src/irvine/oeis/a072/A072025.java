package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072025 <code>a(n) = n^4 + 2*n^3 + 4*n^2 + 3*n + 1 = ((n+1)^5+n^5) / (2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A072025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072025() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 55, 181, 461});
  }
}
