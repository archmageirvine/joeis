package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035198 From a Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035198 extends Sequence0 {

  private int mN = 0;
  private final Fast mPrime = new Fast();
  private Ds mD = Dgf.one();

  private void updateDirichlet(final int p) {
    if (mPrime.isPrime(p)) {
      switch (p & 7) {
        case 1:
          mD = Dgf.multiply(mD, Dgf.square(Dgf.zetam(p)));
          break;
        case 3:
        case 5:
          mD = Dgf.multiply(mD, Dgf.substitute(Dgf.zetam(p), 2));
          break;
        default:
          break;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      updateDirichlet(++mN);
      if (!mD.coeff(mN).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

