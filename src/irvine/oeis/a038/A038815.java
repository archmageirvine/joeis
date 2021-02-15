package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038815 Number of primes less than n*10^6.
 * @author Sean A. Irvine
 */
public class A038815 extends A000720 {

  @Override
  public Z next() {
    for (int k = 0; k < 999999; ++k) {
      super.next();
    }
    return super.next();
  }
}
