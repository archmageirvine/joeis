package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066599 a(n) = smallest number which can be expressed as the product of a number and its reversal in exactly n different ways.
 * @author Sean A. Irvine
 */
public class A066599 extends Sequence1 {

  private int mN = 0;

  private boolean is(final long n) {
    int cnt = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      final long e = n / d;
      if (d >= e && Functions.REVERSE.l(d) == e && ++cnt > mN) {
        return false;
      }
    }
    return cnt == mN;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}
