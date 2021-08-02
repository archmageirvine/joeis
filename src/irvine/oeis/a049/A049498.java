package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049498 a(n) and a(n)+4^k are primes at least for k=1,2,3,4,5,6,7,8.
 * @author Sean A. Irvine
 */
public class A049498 extends A049497 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(65536).isProbablePrime()) {
        return p;
      }
    }
  }
}
