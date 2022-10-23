package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048244 A048106 is applied to A001405: the terms indicate whether more, equal or fewer unitary than non-unitary divisors of the central binomial coefficient exists.
 * @author Sean A. Irvine
 */
public class A048244 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = mFactor.factorize(Binomial.binomial(++mN, mN / 2));
    return fs.unitarySigma0().multiply2().subtract(fs.sigma0());
  }
}
