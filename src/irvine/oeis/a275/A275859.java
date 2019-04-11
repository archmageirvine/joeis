package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275859 <code>a(n) =</code> floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r <code>= 1 + sqrt(2),</code> s = r/(r-1), c <code>= 2,</code> d <code>= 1, a(0) = 1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275859() {
    super(new long[] {-1, 1, 0, -4, 5}, new long[] {1, 1, 5, 19, 76});
  }
}
