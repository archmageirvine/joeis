package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038680 Primes ending in a (different) prime.
 * @author Sean A. Irvine
 */
public class A038680 extends A000040 {

  {
    super.next(); // 2
    super.next(); // 3
    super.next(); // 5
    super.next(); // 7
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(10);
      if (r == 3 || r == 7) {
        return p;
      }
      final String s = p.toString();
      for (int k = s.length() - 2; k > 0; --k) {
        final Z t = new Z(s.substring(k));
        if (t.isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
