package irvine.oeis.a031;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031366.
 * @author Sean A. Irvine
 */
public class A031366 implements Sequence {

  // todo this not right

  private final Fast mPrime = new Fast();
  private final List<Z> mZetaP = new ArrayList<>();
  private List<Z> mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  {
    mZetaP.add(Z.ZERO);
    mZetaP.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      while (mZetaP.size() < mMaxOrd) {
        mZetaP.add(Z.ZERO);
      }
      List<Z> zp = mZetaP;
      for (int p = 2; p < mMaxOrd; p = (int) mPrime.nextPrime(p)) {
        switch (p % 5) {
          case 0: // i.e. p == 5
            zp = A031361.dirichletProduct(zp, A031362.zeta(p, mMaxOrd, Z.ONE));
            break;
          case 1:
          case 4:
            final List<Z> t = A031362.zeta(p, mMaxOrd, Z.ONE);
            zp = A031361.dirichletProduct(zp, A031361.dirichletProduct(t, t));
            break;
          case 2:
          case 3:
            zp = A031361.dirichletProduct(zp, A031362.zeta(p * p, mMaxOrd, Z.ONE));
            break;
        }
      }
      mDirichlet = zp;
    }
    return mDirichlet.get(mN);
  }
}
