package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A080114 Odd primes p for which all sums Sum_{j=1..u} L(j/p) (with u ranging from 1 to (p-1)/2) are nonnegative, where L(j/p) is Legendre symbol of j and p.
 * @author Sean A. Irvine
 */
public class A080114 extends A065091 {

  static boolean is(final long p) {
    long s = 0;
    for (long j = 1; j <= (p - 1) / 2; ++j) {
      s += Functions.JACOBI.i(j, p);
      if (s < 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
