package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067889 Primes sandwiched between two numbers having same number of divisors.
 * @author Sean A. Irvine
 */
public class A067889 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.SIGMA0.z(p.subtract(1)).equals(Functions.SIGMA0.z(p.add(1)))) {
        return p;
      }
    }
  }
}
