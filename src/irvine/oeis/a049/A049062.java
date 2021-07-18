package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A049062 Composite n coprime to 5 such that Fibonacci(n) == Legendre(n,5) (mod n).
 * @author Sean A. Irvine
 */
public class A049062 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z comp = super.next();
      if (comp.gcd(Z.FIVE).equals(Z.ONE)) {
        long a = 0;
        long b = 1;
        final long n = comp.longValueExact();
        for (long k = 1; k < n; ++k) {
          final long t = (a + b) % n;
          a = b;
          b = t;
        }
        final int j = LongUtils.jacobi(n, 5);
        if (b == j || (j == -1 && b == n - 1)) {
          return comp;
        }
      }
    }
  }
}
