package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275857 a(n) = floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r = (1+sqrt(5))/2, s = r/(r-1), c = 1, d = 1, a(0) = 1, a(1) = 2.
 * @author Sean A. Irvine
 */
public class A275857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275857() {
    super(new long[] {-1, 0, 1, -3, 4}, new long[] {1, 2, 6, 18, 56});
  }
}
