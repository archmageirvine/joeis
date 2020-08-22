package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275858 a(n) = floor(c*r*a(n-1)) - floor(d*s*a(n-2)), where r = (1+sqrt(5))/2, s = r/(r-1), c = 1, d = 1, a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A275858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275858() {
    super(new long[] {-1, -1, -2, 1}, new long[] {1, 1, -1, -4});
  }
}
