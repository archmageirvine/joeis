package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167816 Numerator of x(n) = x(n-1) + x(n-2), x(0)=0, x(1)=1/3; denominator=A167817.
 * @author Sean A. Irvine
 */
public class A167816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167816() {
    super(new long[] {-1, 0, 0, 0, 7, 0, 0, 0}, new long[] {0, 1, 1, 2, 1, 5, 8, 13});
  }
}
