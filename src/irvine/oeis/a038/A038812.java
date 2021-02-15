package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A038812 Number of primes less than 1000n.
 * @author Sean A. Irvine
 */
public class A038812 extends A000720 {

  @Override
  public Z next() {
    for (int k = 0; k < 999; ++k) {
      super.next();
    }
    return super.next();
  }
}
