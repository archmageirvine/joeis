package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071263 Smallest nontrivial composite number beginning with n.
 * @author Sean A. Irvine
 */
public class A071263 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 10;
    long m = mN;
    long k = 0;
    long lim = 10;
    while (true) {
      if (++k == lim) {
        m *= 10;
        lim *= 10;
        k = 1;
      }
      if (!mPrime.isPrime(m + k)) {
        return Z.valueOf(m + k);
      }
    }
  }
}

