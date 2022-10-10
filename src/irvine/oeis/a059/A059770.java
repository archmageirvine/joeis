package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059770 First solution of x^2 = 2 mod p for primes p such that a solution exists.
 * @author Sean A. Irvine
 */
public class A059770 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(8);
      if (r == 1 || r == 2 || r == 7) {
        final Z t = Z.TWO.mod(p);
        long k = -1;
        while (true) {
          final Z kz = Z.valueOf(++k);
          if (kz.modSquare(p).equals(t)) {
            return kz;
          }
        }
      }
    }
  }
}
