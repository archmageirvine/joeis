package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048685 Consider number of prime divisors counted with multiplicity (A001222). Apply this function to C(n,k)'s. Find maximum and count its occurrence.
 * @author Sean A. Irvine
 */
public class A048685 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    long cnt = 0;
    for (long k = 0; k <= mN / 2; ++k) {
      final long omega = mFactor.factorize(Binomial.binomial(mN, k)).bigOmega();
      if (omega > max) {
        max = omega;
        cnt = 2 * k == mN ? 1 : 2;
      } else if (omega == max) {
        cnt += 2 * k == mN ? 1 : 2;
      }
    }
    return Z.valueOf(cnt);
  }
}

