package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049497 a(n) and a(n)+4^k are primes at least for k=1,2,3,4,5,6,7.
 * @author Sean A. Irvine
 */
public class A049497 extends A049496 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(16384).isProbablePrime()) {
        return p;
      }
    }
  }
}
