package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035026 Number of times that i and 2n-i are both prime, for i = 1, ..., 2n-1.
 * @author Sean A. Irvine
 */
public class A035026 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long c = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN - p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
