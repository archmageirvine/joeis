package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Dirichlet;
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
          zp = Dirichlet.dirichletProduct(zp, Dirichlet.zetaNum(e, mMaxOrd, Z.ONE));
          zp = Dirichlet.dirichletProduct(zp, Dirichlet.zeta(e, mMaxOrd, Z.ONE));
        }
      }
      zp = Dirichlet.dirichletProduct(zp, zp);
      mDirichlet = zp;
    }
    return mDirichlet.get(mN);
  }
}
