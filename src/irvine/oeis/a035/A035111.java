package irvine.oeis.a035;

import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Dirichlet;
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
  private List<Z> mD = phiIcosahedron(mMax);

  protected List<Z> phiIcosahedron(final int n) {
    List<Z> d = Dirichlet.dirichletProduct(Dirichlet.zetaNum(5, n, Z.ONE), Dirichlet.zeta(5, n, Z.FIVE));
    for (int p = 2; p <= n; p = (int) mPrime.nextPrime(p)) {
      switch (p % 5) {
        case 1:
        case 4:
          final List<Z> dp = Dirichlet.dirichletProduct(Dirichlet.zetaNum(p, n, Z.ONE), Dirichlet.zeta(p, n, Z.valueOf(p)));
          d = Dirichlet.dirichletProduct(d, Dirichlet.dirichletProduct(dp, dp));
          break;
        case 2:
        case 3:
          final long p2 = p * (long) p;
          if (p2 < n) {
            final List<Z> da = Dirichlet.dirichletProduct(Dirichlet.zetaNum((int) p2, n, Z.ONE), Dirichlet.zeta((int) p2, n, Z.valueOf(p2)));
            d = Dirichlet.dirichletProduct(d, da);
          }
          break;
        default:
          assert p == 5; // already handled
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
      final Z t = mD.get(mN);
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}

