package irvine.oeis.a145;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A145748 Numbers n such that phi(n+1)-phi(n)=sigma(n+1)-sigma(n).
 * @author Sean A. Irvine
 */
public class A145748 extends Sequence1 {

  private long mN = 1;
  private Z mPrevSigma = Z.ONE;
  private long mPrevPhi = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = Jaguar.factor(mN);
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

