package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035250 Number of primes between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A035250 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long end = 2 * ++mN;
    long c = 0;
    for (long p = mPrime.nextPrime(mN - 1); p <= end; p = mPrime.nextPrime(p)) {
      ++c;
    }
    return Z.valueOf(c);
  }
}

