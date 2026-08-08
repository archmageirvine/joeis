package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086218 Primes p such that 3^p - 2 is prime.
 * @author Sean A. Irvine
 */
public class A086218 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = Z.THREE.pow(p).subtract(2);
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}
