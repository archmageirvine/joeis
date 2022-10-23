package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035198 From a Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035198 extends Sequence0 {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private DirichletSeries mD = updateDirichlet();

  private DirichletSeries updateDirichlet() {
    DirichletSeries d = DirichletSeries.ONE;
    for (long p = 2; p <= mMax; p = mPrime.nextPrime(p)) {
      switch ((int) (p & 7)) {
        case 1:
          d = d.multiply(DirichletSeries.zeta(p, mMax, Z.ONE).pow(2, mMax), mMax);
          break;
        case 3:
        case 5:
          d = d.multiply(DirichletSeries.zeta(p, mMax, Z.ONE).scale(2, mMax), mMax);
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

