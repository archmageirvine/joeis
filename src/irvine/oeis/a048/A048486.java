package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048486 Values of k for which the earliest maximal value of A001221(C(k,j)) is j = floor(k/2).
 * @author Sean A. Irvine
 */
public class A048486 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int max = 0;
      long maxk = 0;
      for (long k = 0; k <= mN / 2; ++k) {
        final int omega = mFactor.factorize(Binomial.binomial(mN, k)).omega();
        if (omega > max) {
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

