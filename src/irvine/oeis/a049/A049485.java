package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049485 Both p and p+510510 are primes, where 510510 is the 7th primorial number A002110(7).
 * @author Sean A. Irvine
 */
public class A049485 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(510510).isProbablePrime()) {
        return p;
      }
    }
  }
}
