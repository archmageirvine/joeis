package irvine.oeis.a019;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019491 Numbers n for which number of distinct prime divisors of binomial(n,k) has local minimum at k <code>= n/2</code>.
 * @author Sean A. Irvine
 */
public class A019491 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long t = mN / 2;
      final long mid = mFactor.factorize(Binomial.binomial(mN, t)).omega();
      for (long k = t - 1; k >= 0; --k) {
        final long left = mFactor.factorize(Binomial.binomial(mN, k)).omega();
        if (mid > left) {
          break; // not a minimum
        }
        if (mid < left) {
          for (long j = t + 1; j <= mN; ++j) {
            final long right = mFactor.factorize(Binomial.binomial(mN, j)).omega();
            if (mid > right) {
              break; // not a minimum
            }
            if (mid < right) {
              return Z.valueOf(mN);
            }
          }
          break;
        }
      }
    }
  }
}
