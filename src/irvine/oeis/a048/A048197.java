package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048197 Numbers n for which binomial(n, floor(n/2)) has more unitary than non-unitary divisors.
 * @author Sean A. Irvine
 */
public class A048197 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = mFactor.factorize(Binomial.binomial(++mN, mN / 2));
      if (fs.unitarySigma0().multiply2().compareTo(fs.sigma0()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
