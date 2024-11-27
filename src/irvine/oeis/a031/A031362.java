package irvine.oeis.a031;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031362 Number of coincidence site modules of index 10n+1 with 10-fold symmetry in plane.
 * @author Sean A. Irvine
 */
public class A031362 extends Sequence1 {

  // After R. J. Mathar

  private final Fast mPrime = new Fast();
  private Ds mDirichlet = null;
  private int mN = -9;
  private int mMaxOrd = 1;

  @Override
  public Z next() {
    mN += 10;
    if (mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      Ds zp = Dgf.one();
      for (int e = 1; e <= mMaxOrd; e += 5) {
        if (mPrime.isPrime(e)) {
          zp = Dgf.multiply(Dgf.multiply(zp, Dgf.simple(e)), Dgf.zetap(e));
        }
      }
      zp = Dgf.square(zp);
      mDirichlet = zp;
    }
    return mDirichlet.coeff(mN);
  }
}
