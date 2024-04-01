package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069051 Primes p such that p-1 divides 2^p-2.
 * @author Sean A. Irvine
 */
public class A069051 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z m = p.subtract(1);
      if (Z.TWO.modPow(p, m).subtract(2).mod(m).isZero()) {
        return p;
      }
    }
  }
}

