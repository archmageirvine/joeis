package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068990 Primes which remain prime after each digit is increased by 2.
 * @author Sean A. Irvine
 */
public class A068990 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      Z q = Z.ZERO;
      for (int k = 0; k < s.length(); ++k) {
        final int t = s.charAt(k) - '0' + 2;
        q = q.multiply(t >= 10 ? 100 : 10).add(t);
      }
      if (q.isProbablePrime()) {
        return p;
      }
    }
  }
}
