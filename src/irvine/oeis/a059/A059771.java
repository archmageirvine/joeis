package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059771 Second solution of x^2 = 2 mod p for primes p such that a solution exists.
 * @author Sean A. Irvine
 */
public class A059771 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p)) {
        return Z.ZERO;
      }
      final long r = p.mod(8);
      if (r == 1 || r == 2 || r == 7) {
        long k = -1;
        boolean seen = false;
        while (true) {
          final Z kz = Z.valueOf(++k);
          if (kz.modSquare(p).equals(Z.TWO)) {
            if (seen) {
              return kz;
            }
            seen = true;
          }
        }
      }
    }
  }
}
