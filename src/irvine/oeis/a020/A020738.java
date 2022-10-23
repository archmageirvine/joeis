package irvine.oeis.a020;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020738 Consider number of divisors of binomial(n, k), k=0..n; a(n) = multiplicity of maximal value.
 * @author Sean A. Irvine
 */
public class A020738 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    final boolean odd = (++mN & 1) == 1;
    Z best = Z.ZERO;
    long bestc = 0;
    final long lim = mN / 2;
    for (long k = 0; k <= lim; ++k) {
      final Z c = mFactor.factorize(Binomial.binomial(mN, k)).sigma0();
      if (c.compareTo(best) >= 0) {
        if (c.compareTo(best) > 0) {
          best = c;
          bestc = odd || k < lim ? 2 : 1;
        } else {
          bestc += odd || k < lim ? 2 : 1;
        }
      }
    }
    return Z.valueOf(bestc);
  }
}
