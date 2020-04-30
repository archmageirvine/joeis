package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031362 Number of coincidence site modules of index <code>10n+1</code> with 10-fold symmetry in plane.
 * @author Sean A. Irvine
 */
public class A031362 implements Sequence {

  // After R. J. Mathar

  private final Fast mPrime = new Fast();
  private final List<Z> mZetaP = new ArrayList<>();
  private List<Z> mDirichlet = null;
  private int mN = -9;
  private int mMaxOrd = 1;

  {
    mZetaP.add(Z.ZERO);
    mZetaP.add(Z.ONE);
  }

  static List<Z> zetaNum(final int p, final int max, final Z f) {
    final Z[] res = new Z[max + 1];
    Arrays.fill(res, Z.ZERO);
    res[1] = Z.ONE;
    if (p <= max) {
      res[p] = f;
    }
    return Arrays.asList(res);
  }

  static List<Z> zeta(final int p, final int max, final Z f) {
    final Z[] res = new Z[max + 1];
    Arrays.fill(res, Z.ZERO);
    res[1] = Z.ONE;
    Z u = f;
    for (int q = p; q <= max; q *= p, u = u.multiply(f)) {
      res[q] = u;
    }
    return Arrays.asList(res);
  }

  @Override
  public Z next() {
    mN += 10;
    if (mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      while (mZetaP.size() < mMaxOrd) {
        mZetaP.add(Z.ZERO);
      }
      List<Z> zp = mZetaP;
      for (int e = 1; e <= mMaxOrd; e += 5) {
        if (mPrime.isPrime(e)) {
          zp = A031361.dirichletProduct(zp, zetaNum(e, mMaxOrd, Z.ONE));
          zp = A031361.dirichletProduct(zp, zeta(e, mMaxOrd, Z.ONE));
        }
      }
      zp = A031361.dirichletProduct(zp, zp);
      mDirichlet = zp;
    }
    return mDirichlet.get(mN);
  }
}
