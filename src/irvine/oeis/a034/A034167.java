package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034167 Product of primes == 1 (mod 7) and cubes of primes == 2 or 4 (mod 7).
 * @author Sean A. Irvine
 */
public class A034167 extends Sequence1 {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private Ds mD = updateDirichlet();

  private Ds updateDirichlet() {
    Ds d = Dgf.multiply(Dgf.simple(8), Dgf.zetap(8));
    for (int p = 3; p <= mMax; p = (int) mPrime.nextPrime(p)) {
      switch (p % 7) {
        case 1:
          d = Dgf.multiply(d, Dgf.pow(Dgf.multiply(Dgf.simple(p), Dgf.zetap(p)), 3));
          break;
        case 2:
        case 4:
          final int p3 = p * p * p;
          if (p3 < mMax) {
            d = Dgf.multiply(d, Dgf.multiply(Dgf.simple(p3), Dgf.zetap(p3)));
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

