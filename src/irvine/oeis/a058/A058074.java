package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058074 Integers m such that gcd(d(m),d(m+1)) = 1, where d(m) is number of positive divisors of m.
 * @author Sean A. Irvine
 */
public class A058074 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma;
      mSigma = Functions.SIGMA0.z(++mN + 1);
      if (Z.ONE.equals(s.gcd(mSigma))) {
        return Z.valueOf(mN);
      }
    }
  }
}

