package irvine.oeis.a034;

import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Dirichlet;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034167 Product of primes <code>= 1 (mod 7)</code> and cubes of primes <code>= 2</code> or <code>4 (mod 7)</code>.
 * @author Sean A. Irvine
 */
public class A034167 implements Sequence {

  private int mN = 0;
  private int mMax = 100;
  private List<Z> mD = updateDirichlet();

  private List<Z> updateDirichlet() {
    final Fast prime = new Fast();
    List<Z> d = Dirichlet.dirichletProduct(Dirichlet.zetaNum(8, mMax, Z.ONE), Dirichlet.zeta(8, mMax, Z.ONE));
    for (int p = 3; p <= mMax; p = (int) prime.nextPrime(p)) {
      switch (p % 7) {
        case 1:
          final List<Z> dp = Dirichlet.dirichletProduct(Dirichlet.zetaNum(p, mMax, Z.ONE), Dirichlet.zeta(p, mMax, Z.ONE));
          d = Dirichlet.dirichletProduct(d, Dirichlet.dirichletProduct(dp, Dirichlet.dirichletProduct(dp, dp)));
          break;
        case 2:
        case 4:
          final long p3 = p * (long) p * p;
          if (p3 < mMax) {
            final List<Z> da = Dirichlet.dirichletProduct(Dirichlet.zetaNum((int) p3, mMax, Z.ONE), Dirichlet.zeta((int) p3, mMax, Z.ONE));
            d = Dirichlet.dirichletProduct(d, da);
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

