package irvine.oeis.a035;

import java.util.List;

import irvine.math.z.Dirichlet;
import irvine.math.z.Z;

/**
 * A035110.
 * @author Sean A. Irvine
 */
public class A035110 extends A035111 {

  private int mN = 0;
  private int mMax = 100;
  private List<Z> mD = updateDirichlet();

  // zeta_(\Q(tau))(s)
  private List<Z> zetaQuadraticTau(final int n) {
    List<Z> d = Dirichlet.zeta(5, n, Z.ONE);
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
        case 4:
          final List<Z> dp = Dirichlet.zeta(p, n, Z.ONE);
          final List<Z> dp2 = Dirichlet.dirichletProduct(dp, dp);
          d = Dirichlet.dirichletProduct(d, dp2);
          break;
        case 2:
        case 3:
          final long p2 = p * (long) p;
          if (p2 < n) {
            final List<Z> db = Dirichlet.zeta((int) p2, n, Z.ONE);
            d = Dirichlet.dirichletProduct(d, db);
          }
          break;
        default:
          break;
      }
    }
    return d;
  }

  private List<Z> updateDirichlet() {
    final List<Z> d = Dirichlet.scale(phiIcosahedron(mMax / 3), 3, mMax);
    final List<Z> zetaTau3 = Dirichlet.scale(zetaQuadraticTau(mMax / 3), 3, mMax);
    return Dirichlet.dirichletProduct(d, zetaTau3);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mMax || mD == null) {
        mMax *= 2;
        mD = updateDirichlet();
      }
      final Z t = mD.get(mN);
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}

