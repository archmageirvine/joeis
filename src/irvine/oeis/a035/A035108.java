package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035108 Denominators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035108 implements Sequence {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private DirichletSeries mD = updateDirichlet();

  private DirichletSeries updateDirichlet() {
    DirichletSeries d = DirichletSeries.zeta(5, mMax, Z.ONE);
    for (long p = 2; p <= mMax; p = mPrime.nextPrime(p)) {
      switch ((int) (p % 5)) {
        case 1:
          d = d.multiply(DirichletSeries.zeta(p, mMax, Z.ONE).pow(4, mMax), mMax);
          break;
        case 4:
          final long p2 = p * p;
          if (p2 < mMax) {
            d = d.multiply(DirichletSeries.zeta(p2, mMax, Z.ONE).pow(2, mMax), mMax);
          }
          break;
        case 2:
        case 3:
          final long pb2 = p * p;
          final long p4 = pb2 * pb2;
          if (p4 < mMax) {
            d = d.multiply(DirichletSeries.zeta(p4, mMax, Z.ONE), mMax);
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

