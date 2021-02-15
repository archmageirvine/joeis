package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038821 Number of primes less than n*10^12.
 * @author Sean A. Irvine
 */
public class A038821 extends A000720 {

  @Override
  public Z next() {
    for (long k = 0; k < 999999999999L; ++k) {
      super.next();
    }
    return super.next();
  }
}
