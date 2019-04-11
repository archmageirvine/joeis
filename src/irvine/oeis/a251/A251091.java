package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251091 <code>a(n) = n^2 /</code> gcd(n+2, <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A251091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251091() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 1, 9, 8, 25, 9, 49, 32, 81, 25, 121});
  }
}
