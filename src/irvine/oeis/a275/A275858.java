package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275858 <code>a(n) =</code> floor(c*r*a(n-1)) - floor(d*s*a(n-2)), where r <code>= (1+sqrt(5))/2,</code> s = r/(r-1), c <code>= 1,</code> d <code>= 1, a(0) = 1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275858() {
    super(new long[] {-1, -1, -2, 1}, new long[] {1, 1, -1, -4});
  }
}
