package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053579 Composite numbers whose cototient (A051953) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053579 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long t = mN - LongUtils.phi(mN);
        if ((t & (t - 1)) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
