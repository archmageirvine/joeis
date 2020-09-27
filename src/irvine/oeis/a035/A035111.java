package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035111.
 * @author Sean A. Irvine
 */
public class A035111 implements Sequence {

  private int mN = 0;
  private int mMax = 100;
  protected final Fast mPrime = new Fast();
  private DirichletSeries mD = phiIcosahedron(mMax);

  protected DirichletSeries phiIcosahedron(final int n) {
    DirichletSeries d = DirichletSeries.zetaNum(5, n, Z.ONE).multiply(DirichletSeries.zeta(5, n, Z.FIVE), n);
    for (long p = 2; p <= n; p = mPrime.nextPrime(p)) {
      switch ((int) (p % 5)) {
        case 1:
        case 4:
          final DirichletSeries dp = DirichletSeries.zetaNum(p, n, Z.ONE).multiply(DirichletSeries.zeta(p, n, Z.valueOf(p)), n);
          d = d.multiply(dp.pow(2, n), n);
          break;
        case 2:
        case 3:
          final long p2 = p * p;
          if (p2 < n) {
            final DirichletSeries da = DirichletSeries.zetaNum(p2, n, Z.ONE).multiply(DirichletSeries.zeta(p2, n, Z.valueOf(p2)), n);
            d = d.multiply(da, n);
          }
          break;
        default:
          assert p == 5;
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
        mD = phiIcosahedron(mMax);
      }
      final Z t = mD.coeff(mN);
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}

