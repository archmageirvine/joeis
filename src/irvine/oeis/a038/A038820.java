package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038820 Number of primes less than n*10^11.
 * @author Sean A. Irvine
 */
public class A038820 extends A000720 {

  @Override
  public Z next() {
    for (long k = 0; k < 99999999999L; ++k) {
      super.next();
    }
    return super.next();
  }
}
