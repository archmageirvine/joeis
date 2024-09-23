package irvine.oeis.a020;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020733 Consider number of prime divisors of binomial(n,k), k=0..n; a(n) = multiplicity of the maximum value.
 * @author Sean A. Irvine
 */
public class A020733 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    final boolean odd = (++mN & 1) == 1;
    long best = 0;
    long bestc = 0;
    final long lim = mN / 2;
    for (long k = 0; k <= lim; ++k) {
      final long c = mFactor.factorize(Binomial.binomial(mN, k)).omega();
      if (c >= best) {
        if (c > best) {
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
