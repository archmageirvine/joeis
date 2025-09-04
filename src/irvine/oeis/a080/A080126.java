package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A080126 Number of primes less than n*10^17.
 * @author Sean A. Irvine
 */
public class A080126 extends A000720 {

  // Too slow to be useful

  @Override
  public Z next() {
    for (long k = 0; k < 99999999999999999L; ++k) {
      super.next();
    }
    return super.next();
  }
}
