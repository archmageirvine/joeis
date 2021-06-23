package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048569 Values of k for which the number of divisors of the central binomial coefficient C(k, floor(k/2)) exceeds the number of divisors of all other binomial coefficients C(k,j).
 * @author Sean A. Irvine
 */
public class A048569 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z max = Z.ZERO;
      long maxk = 0;
      for (long k = 0; k <= mN / 2; ++k) {
        final Z omega = mFactor.factorize(Binomial.binomial(mN, k)).sigma0();
        if (omega.compareTo(max) > 0) {
          max = omega;
          maxk = k;
        }
      }
      if (maxk == mN / 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

