package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067799 Numbers k such that phi(k) + phi(k+1) = sigma(k).
 * @author Sean A. Irvine
 */
public class A067799 extends Sequence1 {

  private long mN = 0;
  private Z mPhi = Z.ONE;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPhi;
      final Z s = mSigma;
      final FactorSequence fs = Jaguar.factor(++mN);
      mPhi = fs.phi();
      mSigma = fs.sigma();
      if (t.add(mPhi).equals(s)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
