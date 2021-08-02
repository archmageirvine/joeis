package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049493 Numbers n such that n and n+4^k are all primes for k=1,2,3.
 * @author Sean A. Irvine
 */
public class A049493 extends A049492 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(64).isProbablePrime()) {
        return p;
      }
    }
  }
}
