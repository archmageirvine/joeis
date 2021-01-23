package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107970 a(n) = (n+1)*(n+2)^3*(n+3)*(2n+3)*(2n+5)/360.
 * @author Sean A. Irvine
 */
public class A107970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107970() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 21, 168, 825, 3003, 8918, 22848, 52326});
  }
}
