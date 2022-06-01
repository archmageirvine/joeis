package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275860 floor(c*s*a(n-1)) + floor(d*r*a(n-2)), where r =  (3 + sqrt(13))/2, s = r/(r-1), c = 3, d = 1, a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A275860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275860() {
    super(new long[] {-1, 1, 0, -4, 0, 0, 5}, new long[] {1, 1, 7, 33, 164, 813, 4039});
  }
}
