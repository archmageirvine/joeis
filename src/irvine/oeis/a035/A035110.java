package irvine.oeis.a035;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;

/**
 * A035110 Numerators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035110 extends A035111 {

  private int mN = 0;
  private int mMax = 100;
  private DirichletSeries mD = updateDirichlet();

  // zeta_(\Q(tau))(s)
  private DirichletSeries zetaQuadraticTau(final int n) {
    DirichletSeries d = DirichletSeries.zeta(5, n, Z.ONE);
    for (long p = 2; p <= n; p = mPrime.nextPrime(p)) {
      switch ((int) (p % 5)) {
        case 1:
        case 4:
          d = d.multiply(DirichletSeries.zeta(p, n, Z.ONE).pow(2, n), n);
          break;
        case 2:
        case 3:
          final long p2 = p * p;
          if (p2 < n) {
            d = d.multiply(DirichletSeries.zeta(p2, n, Z.ONE), n);
          }
          break;
        default:
          break;
      }
    }
    return d;
  }

  private DirichletSeries updateDirichlet() {
    final DirichletSeries d = phiIcosahedron(mMax / 3).scale(3, mMax);
    final DirichletSeries zetaTau3 = zetaQuadraticTau(mMax / 3).scale(3, mMax);
    return d.multiply(zetaTau3, mMax);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mMax || mD == null) {
        mMax *= 2;
        mD = updateDirichlet();
      }
      final Z t = mD.coeff(mN);
      if (!t.isZero()) {
        return t;
      }
    }
  }
}

