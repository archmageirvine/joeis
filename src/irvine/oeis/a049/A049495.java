package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049495 a(n) and a(n)+4^k are primes at least for k=1,2,3,4,5.
 * @author Sean A. Irvine
 */
public class A049495 extends A049494 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(1024).isProbablePrime()) {
        return p;
      }
    }
  }
}
