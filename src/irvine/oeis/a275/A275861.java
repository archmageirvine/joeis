package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275861 <code>a(n) =</code> floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r <code>= 2 + sqrt(5)</code>, s = r/(r-1), c <code>= 4</code>, d <code>= 1, a(0) = 1, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275861() {
    super(new long[] {-1, 3, -3, -3, 5, -7, 7}, new long[] {1, 1, 9, 51, 305, 1813, 10784});
  }
}
