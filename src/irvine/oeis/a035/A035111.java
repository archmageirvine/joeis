package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035111 Numerators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035111 extends Sequence0 {

  private int mN = 0;
  private int mMax = 100;
  protected final Fast mPrime = new Fast();
  private Ds mD = phiIcosahedron(mMax);

  protected Ds phiIcosahedron(final int n) {
    Ds d = Dgf.multiply(Dgf.simple(5), Dgf.zetap(5, Z.FIVE));
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
        case 4:
          final Ds dp = Dgf.multiply(Dgf.simple(p), Dgf.zetap(p, Z.valueOf(p)));
          d = Dgf.multiply(d, Dgf.square(dp));
          break;
        case 2:
        case 3:
          final int p2 = p * p;
          if (p2 < n) {
            final Ds da = Dgf.multiply(Dgf.simple(p2), Dgf.zetap(p2, Z.valueOf(p2)));
            d = Dgf.multiply(d, da);
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
      if (!t.isZero()) {
        return t;
      }
    }
  }
}

