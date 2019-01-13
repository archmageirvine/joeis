package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002375.
 * @author Sean A. Irvine
 */
public class A002375 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long m = 2 * ++mN;
    long c = 0;
    for (long p = 3; p <= mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(m - p)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
