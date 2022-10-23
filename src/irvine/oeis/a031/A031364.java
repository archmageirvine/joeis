package irvine.oeis.a031;

import irvine.factor.prime.Fast;
import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031364 Number of coincidence site modules of index 10n+1 in an icosahedral module.
 * @author Sean A. Irvine
 */
public class A031364 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DirichletSeries mZetaP = new DirichletSeries();
  private DirichletSeries mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  {
    mZetaP.put(Z.ONE, Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      DirichletSeries zp = mZetaP;
      for (long p = 2; p < mMaxOrd; p = mPrime.nextPrime(p)) {
        switch ((int) (p % 5)) {
          case 0: // i.e. p == 5
            zp = zp.multiply(DirichletSeries.zetaNum(p, mMaxOrd, Z.ONE), mMaxOrd);
            zp = zp.multiply(DirichletSeries.zeta(p, mMaxOrd, Z.valueOf(p)), mMaxOrd);
            break;
          case 1:
          case 4:
            final DirichletSeries t = DirichletSeries.zetaNum(p, mMaxOrd, Z.ONE).multiply(DirichletSeries.zeta(p, mMaxOrd, Z.valueOf(p)), mMaxOrd);
            zp = zp.multiply(t.pow(2, mMaxOrd), mMaxOrd);
            break;
          case 2:
          case 3:
          default:
            zp = zp.multiply(DirichletSeries.zetaNum(p * p, mMaxOrd, Z.ONE), mMaxOrd);
            zp = zp.multiply(DirichletSeries.zeta(p * p, mMaxOrd, Z.valueOf(p * p)), mMaxOrd);
            break;
        }
      }
      mDirichlet = zp;
    }
    return mDirichlet.coeff(mN);
  }
}
