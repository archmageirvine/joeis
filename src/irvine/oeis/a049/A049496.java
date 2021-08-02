package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049496 a(n) and a(n)+4^k are primes at least for k=1,2,3,4,5,6.
 * @author Sean A. Irvine
 */
public class A049496 extends A049495 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(4096).isProbablePrime()) {
        return p;
      }
    }
  }
}
