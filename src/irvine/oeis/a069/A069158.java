package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069158 a(n) = Product{d|n} mu(d), product over positive divisors, d, of n, where mu(d) = Moebius function (A008683).
 * @author Sean A. Irvine
 */
public class A069158 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long prod = 1;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod *= Functions.MOBIUS.i(d.longValue());
      if (prod == 0) {
        return Z.ZERO;
      }
    }
    return Z.valueOf(prod);
  }
}

