package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262183 a(0) = 0, a(n) = 10*a(n-1) + n*(n+1)*(n+2)/6.
 * @author Sean A. Irvine
 */
public class A262183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262183() {
    super(new long[] {10, -41, 64, -46, 14}, new long[] {0, 1, 14, 150, 1520});
  }
}
