package irvine.oeis.a031;

import irvine.factor.prime.Fast;
import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031364 Number of coincidence site modules of index 10n+1 in an icosahedral module.
 * @author Sean A. Irvine
 */
public class A031364 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Ds mDirichlet = null;
  private int mN = 0;
  private int mMaxOrd = 1;

  @Override
  public Z next() {
    if (++mN >= mMaxOrd) {
      // Regenerate (progressively bigger chunks each time)
      mMaxOrd = 2 * mN;
      Ds zp = Dgf.one();
      for (int p = 2; p < mMaxOrd; p = (int) mPrime.nextPrime(p)) {
        switch (p % 5) {
          case 0: // i.e. p == 5
            zp = Dgf.multiply(Dgf.multiply(zp, Dgf.simple(p)), Dgf.zetam(p, Z.valueOf(p)));
            break;
          case 1:
          case 4:
            zp = Dgf.multiply(zp, Dgf.square(Dgf.multiply(Dgf.simple(p), Dgf.zetam(p, Z.valueOf(p)))));
            break;
          case 2:
          case 3:
          default:
            zp = Dgf.multiply(Dgf.multiply(zp, Dgf.simple((long) p * p)), Dgf.zetam((long) p * p, Z.valueOf((long) p * p)));
            break;
        }
      }
      mDirichlet = zp;
    }
    return mDirichlet.coeff(mN);
  }
}
