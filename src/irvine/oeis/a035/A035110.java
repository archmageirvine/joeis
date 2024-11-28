package irvine.oeis.a035;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;

/**
 * A035110 Numerators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035110 extends A035111 {

  private int mN = 0;
  private int mMax = 100;
  private Ds mD = updateDirichlet();

  // zeta_(\Q(tau))(s)
  private Ds zetaQuadraticTau(final int n) {
    Ds d = Dgf.zetam(5);
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
        case 4:
          d = Dgf.multiply(d, Dgf.square(Dgf.zetam(p)));
          break;
        case 2:
        case 3:
          final int p2 = p * p;
          if (p2 < n) {
            d = Dgf.multiply(d, Dgf.zetam(p2));
          }
          break;
        default:
          break;
      }
    }
    return d;
  }

  private Ds updateDirichlet() {
    final Ds d = Dgf.substitute(phiIcosahedron(mMax / 3), 3);
    final Ds zetaTau3 = Dgf.substitute(zetaQuadraticTau(mMax / 3), 3);
    return Dgf.multiply(d, zetaTau3);
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

