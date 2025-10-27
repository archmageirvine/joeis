package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048196 Numbers k for which binomial(k, floor(k/2)) has the same number of unitary and non-unitary divisors.
 * @author Sean A. Irvine
 */
public class A048196 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = mFactor.factor(Binomial.binomial(++mN, mN / 2));
      if (fs.unitarySigma0().multiply2().equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
