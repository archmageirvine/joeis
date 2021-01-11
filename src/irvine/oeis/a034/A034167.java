package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034167 Product of primes == 1 (mod 7) and cubes of primes == 2 or 4 (mod 7).
 * @author Sean A. Irvine
 */
public class A034167 implements Sequence {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private DirichletSeries mD = updateDirichlet();

  private DirichletSeries updateDirichlet() {
    DirichletSeries d = DirichletSeries.zetaNum(8, mMax, Z.ONE).multiply(DirichletSeries.zeta(8, mMax, Z.ONE), mMax);
    for (long p = 3; p <= mMax; p = mPrime.nextPrime(p)) {
      switch ((int) (p % 7)) {
        case 1:
          final DirichletSeries dp = DirichletSeries.zetaNum(p, mMax, Z.ONE).multiply(DirichletSeries.zeta(p, mMax, Z.ONE), mMax);
          d = d.multiply(dp.pow(3, mMax), mMax);
          break;
        case 2:
        case 4:
          final long p3 = p * p * p;
          if (p3 < mMax) {
            final DirichletSeries da = DirichletSeries.zetaNum(p3, mMax, Z.ONE).multiply(DirichletSeries.zeta((int) p3, mMax, Z.ONE), mMax);
            d = d.multiply(da, mMax);
          }
          break;
        default:
          break;
      }
    }
    return d;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mMax || mD == null) {
        mMax *= 2;
        mD = updateDirichlet();
      }
      if (!mD.coeff(mN).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

