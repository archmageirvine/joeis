package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048243 Number of non-unitary divisors of binomial(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A048243 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(Binomial.binomial(++mN, mN / 2));
    return fs.sigma0().subtract(fs.unitarySigma0());
  }
}
