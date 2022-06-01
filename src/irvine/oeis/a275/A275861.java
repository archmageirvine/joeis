package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275861 a(n) = floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r = 2 + sqrt(5), s = r/(r-1), c = 4, d = 1, a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A275861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275861() {
    super(new long[] {-1, 3, -3, -3, 5, -7, 7}, new long[] {1, 1, 9, 51, 305, 1813, 10784});
  }
}
