package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275859 a(n) = floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r = 1 + sqrt(2), s = r/(r-1), c = 2, d = 1, a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A275859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275859() {
    super(new long[] {-1, 1, 0, -4, 5}, new long[] {1, 1, 5, 19, 76});
  }
}
