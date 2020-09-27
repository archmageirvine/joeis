package irvine.oeis.a035;

import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Dirichlet;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035108.
 * @author Sean A. Irvine
 */
public class A035108 implements Sequence {

  private int mN = 0;
  private int mMax = 100;
  private final Fast mPrime = new Fast();
  private List<Z> mD = updateDirichlet();

  private List<Z> updateDirichlet() {
    List<Z> d = Dirichlet.zeta(5, mMax, Z.ONE);
    for (int p = 2; p <= mMax; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
          final List<Z> dp = Dirichlet.zeta(p, mMax, Z.ONE);
          final List<Z> dp2 = Dirichlet.dirichletProduct(dp, dp);
          final List<Z> dp4 = Dirichlet.dirichletProduct(dp2, dp2);
          d = Dirichlet.dirichletProduct(d, dp4);
          break;
        case 4:
          final long p2 = p * (long) p;
          if (p2 < mMax) {
            final List<Z> da = Dirichlet.zeta((int) p2, mMax, Z.ONE);
            final List<Z> da2 = Dirichlet.dirichletProduct(da, da);
            d = Dirichlet.dirichletProduct(d, da2);
          }
          break;
        case 2:
        case 3:
          final long pb2 = p * (long) p;
          final long p4 = pb2 * pb2;
          if (p4 < mMax) {
            final List<Z> db = Dirichlet.zeta((int) p4, mMax, Z.ONE);
            d = Dirichlet.dirichletProduct(d, db);
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
      if (!Z.ZERO.equals(mD.get(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

