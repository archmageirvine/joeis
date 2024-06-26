package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069002 Smallest integer d such that n^2 + (n-d)^2 is a prime number.
 * @author Sean A. Irvine
 */
public class A069002 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    long d = 0;
    while (true) {
      final long v = mN - ++d;
      if (mPrime.isPrime(s + v * v)) {
        return Z.valueOf(d);
      }
    }
  }
}
