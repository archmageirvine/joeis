package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002471 Number of partitions of n into a prime and a square.
 * @author Sean A. Irvine
 */
public class A002471 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    for (long k = 0; k * k < mN; ++k) {
      if (mPrime.isPrime(mN - k * k)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
