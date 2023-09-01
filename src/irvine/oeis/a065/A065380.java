package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065380 Primes of the form p + 2^k, p prime and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A065380 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.THREE.equals(p)) {
        // only value for which p-1 is prime
        return Z.THREE;
      }
      long k = 0;
      Z t;
      while ((t = p.subtract(Z.TWO.pow(++k))).signum() > 0) {
        if (t.isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
