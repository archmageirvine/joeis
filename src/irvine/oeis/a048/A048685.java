package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048685 a(n) is the number of times the maximum value of Omega(binomial(n, k)) occurs in the n-th row of Pascal's triangle, where Omega(n) is the number of prime divisors of n counted with multiplicity (A001222).
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

