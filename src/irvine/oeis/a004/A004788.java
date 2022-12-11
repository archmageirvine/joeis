package irvine.oeis.a004;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004788 Number of distinct prime divisors of the numbers in row n of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A004788 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = new FactorSequence();
    for (long k = 1; k <= mN / 2; ++k) {
      fs.merge(mFactor.factorize(Binomial.binomial(mN, k)));
    }
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(fs.omega());
  }
}

