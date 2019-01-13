package irvine.oeis.a145;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A145748.
 * @author Sean A. Irvine
 */
public class A145748 implements Sequence {

  private long mN = 1;
  private Z mPrevSigma = Z.ONE;
  private long mPrevPhi = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Cheetah.factor(mN);
      final long phi = fs.phi().longValue();
      final Z sigma = fs.sigma();
      final Z dsigma = sigma.subtract(mPrevSigma);
      mPrevSigma = sigma;
      final long dphi = phi - mPrevPhi;
      mPrevPhi = phi;
      if (dsigma.longValue() == dphi) {
        return Z.valueOf(mN - 1);
      }
    }
  }

}

