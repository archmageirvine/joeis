package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a040.A040028;

/**
 * A059899 Primes p such that x^3 = 2 has more than one solution mod p and the sum of the (three) solutions is p.
 * @author Sean A. Irvine
 */
public class A059899 extends A040028 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z sum = Z.ZERO;
      int cnt = 0;
      for (Z x = Z.TWO; x.compareTo(p) < 0; x = x.add(1)) {
        if (x.modPow(Z.THREE, p).equals(Z.TWO)) {
          sum = sum.add(x);
          ++cnt;
        }
      }
      if (cnt == 3 && sum.equals(p)) {
        return p;
      }
    }
  }
}
