package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067282 Numbers k such that phi(k) + phi(k+1) divides sigma(k) + sigma(k+1).
 * @author Sean A. Irvine
 */
public class A067282 extends Sequence1 {

  private int mN = 0;
  private Z mSigma = Z.ONE;
  private Z mPhi = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN + 1);
      final Z sigma = mSigma;
      final Z phi = mPhi;
      mSigma = fs.sigma();
      mPhi = fs.phi();
      if (sigma.add(mSigma).mod(phi.add(mPhi)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
