package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A049492 Primes p such that p+4 and p+16 are also primes.
 * @author Sean A. Irvine
 */
public class A049492 extends A023200 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(16).isProbablePrime()) {
        return p;
      }
    }
  }
}
