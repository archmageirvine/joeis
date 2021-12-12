package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053162 Nonprimes n such that n+cototient(n) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053162 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long t = 2 * mN - LongUtils.phi(mN);
        if ((t & (t - 1)) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
