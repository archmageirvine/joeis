package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038819 Number of primes less than n*10^10.
 * @author Sean A. Irvine
 */
public class A038819 extends A000720 {

  @Override
  public Z next() {
    for (long k = 0; k < 9999999999L; ++k) {
      super.next();
    }
    return super.next();
  }
}
