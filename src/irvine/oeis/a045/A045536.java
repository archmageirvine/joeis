package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A045536 Primes p such that p+2 and 2p+1 are also prime.
 * @author Sean A. Irvine
 */
public class A045536 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.multiply2().add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
