package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049494 a(n) and a(n)+4^k are primes at least for k=1,2,3,4.
 * @author Sean A. Irvine
 */
public class A049494 extends A049493 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(256).isProbablePrime()) {
        return p;
      }
    }
  }
}
