package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A022464 Primes of the form <code>36*n^2 - 810*n + 2753, n &gt;= 0</code>, sorted.
 * @author Sean A. Irvine
 */
public class A022464 extends A000040 {

  private static final Z C = Z.valueOf(135);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.shiftLeft(2).add(7213);
      final Z s = t.sqrt();
      if (t.auxiliary() == 1) {
        final long r = s.mod(12);
        if (r == 9 || (r == 3 && s.compareTo(C) <= 0)) {
          return p;
        }
      }
    }
  }
}
