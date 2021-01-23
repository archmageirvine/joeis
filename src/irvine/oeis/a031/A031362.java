package irvine.oeis.a031;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031362 Number of coincidence site modules of index 10n+1 with 10-fold symmetry in plane.
 * @author Sean A. Irvine
 */
public class A031362 implements Sequence {

  // After R. J. Mathar

  private final Fast mPrime = new Fast();
  private final DirichletSeries mZetaP = new DirichletSeries();
  private DirichletSeries mDirichlet = null;
  private int mN = -9;
  private int mMaxOrd = 1;

  {
    mZetaP.put(Z.ONE, Z.ONE);
  }

  @Override
  public Z next() {
    mN += 10;
    if (mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      DirichletSeries zp = mZetaP;
      for (int e = 1; e <= mMaxOrd; e += 5) {
        if (mPrime.isPrime(e)) {
          zp = zp.multiply(DirichletSeries.zetaNum(e, mMaxOrd, Z.ONE), mMaxOrd);
          zp = zp.multiply(DirichletSeries.zeta(e, mMaxOrd, Z.ONE), mMaxOrd);
        }
      }
      zp = zp.pow(2, mMaxOrd);
      mDirichlet = zp;
    }
    return mDirichlet.coeff(mN);
  }
}
