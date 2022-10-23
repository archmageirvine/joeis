package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048275 a(n) = maximal value for number of divisors of C(n,k) for k=0..n.
 * @author Sean A. Irvine
 */
public class A048275 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      max = max.max(mFactor.factorize(Binomial.binomial(mN, k)).sigma0());
    }
    return max;
  }
}

