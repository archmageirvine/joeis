package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063069 Positive integers n such that phi(n) - d(n) = phi(n+1) - d(n+1) where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063069 extends Sequence1 {

  private long mN = 44;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = mPrev;
      mPrev = fs.phi().subtract(fs.sigma0());
      if (t.equals(mPrev)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
