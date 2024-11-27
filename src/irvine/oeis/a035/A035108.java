package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035108 Denominators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035108 extends Sequence1 {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private Ds mD = updateDirichlet();

  private Ds updateDirichlet() {
    Ds d = Dgf.zetap(5);
    for (int p = 2; p <= mMax; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
          d = Dgf.multiply(d, Dgf.pow(Dgf.zetap(p), 4));
          break;
        case 4:
          final int p2 = p * p;
          if (p2 < mMax) {
            d = Dgf.multiply(d, Dgf.square(Dgf.zetap(p2)));
          }
          break;
        case 2:
        case 3:
          final int pb2 = p * p;
          final int p4 = pb2 * pb2;
          if (p4 < mMax) {
            d = Dgf.multiply(d, Dgf.zetap(p4));
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

