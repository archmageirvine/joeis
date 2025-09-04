package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A080123 Number of primes less than n*10^14.
 * @author Sean A. Irvine
 */
public class A080123 extends A000720 {

  // Too slow to be useful

  @Override
  public Z next() {
    for (long k = 0; k < 99999999999999L; ++k) {
      super.next();
    }
    return super.next();
  }
}
