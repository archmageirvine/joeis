package irvine.oeis.a020;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020740 Max_{k=0..n} d(C(n,k)) - d(C(n,[ n/2 ])), where d() = number of divisors.
 * @author Sean A. Irvine
 */
public class A020740 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    final long lim = ++mN / 2;
    Z best = Z.ZERO;
    final Z s0 = mFactor.factorize(Binomial.binomial(mN, lim)).sigma0();
    for (long k = 0; k < lim; ++k) {
      final Z c = mFactor.factorize(Binomial.binomial(mN, k)).sigma0().subtract(s0);
      if (c.compareTo(best) > 0) {
        best = c;
      }
    }
    return best;
  }
}
