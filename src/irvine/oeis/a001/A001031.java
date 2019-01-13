package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001031.
 * @author Sean A. Irvine
 */
public class A001031 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long n = 2 * mN;
    long p = 1;
    long c = 0;
    do {
      if (mPrime.isPrime(n - p)) {
        ++c;
      }
      p = mPrime.nextPrime(p);
    } while (p <= mN);
    return Z.valueOf(c);
  }
}
