package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038816 Number of primes less than n*10^7.
 * @author Sean A. Irvine
 */
public class A038816 extends A000720 {

  @Override
  public Z next() {
    for (int k = 0; k < 9999999; ++k) {
      super.next();
    }
    return super.next();
  }
}
