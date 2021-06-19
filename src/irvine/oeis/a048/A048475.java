package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048475 a(n) is the smallest k at which the number of divisors of binomial(n,k) is maximized.
 * @author Sean A. Irvine
 */
public class A048475 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long maxk = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z sigma0 = mFactor.factorize(Binomial.binomial(mN, k)).sigma0();
      if (sigma0.compareTo(max) > 0) {
        max = sigma0;
        maxk = k;
      }
    }
    return Z.valueOf(maxk);
  }
}

