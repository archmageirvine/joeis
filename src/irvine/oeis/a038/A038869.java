package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a005.A005382;

/**
 * A038869 Primes p such that both p-2 and 2p-1 are prime.
 * @author Sean A. Irvine
 */
public class A038869 extends A005382 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(2).isProbablePrime()) {
        return p;
      }
    }
  }
}
