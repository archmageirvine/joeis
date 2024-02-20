package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068492 Primes that remain prime after each digit is replaced by its square.
 * @author Sean A. Irvine
 */
public class A068492 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final StringBuilder sb = new StringBuilder();
      Z q = p;
      while (!q.isZero()) {
        final long d = q.mod(10);
        sb.insert(0, d * d);
        q = q.divide(10);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}

