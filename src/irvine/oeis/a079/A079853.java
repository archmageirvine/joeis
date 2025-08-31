package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079853 Primes p for which (p-2)! == 1 (mod p^2).
 * @author Sean A. Irvine
 */
public class A079853 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.square();
      Z f = Z.ONE;
      for (long k = 2; k <= p.longValueExact() - 2; ++k) {
        f = f.modMultiply(k, p2);
      }
      if (f.isOne()) {
        return p;
      }
    }
  }
}

