package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073046 Write 2*n = p + q (p, q prime), p*q minimal; then a(n) = p*q.
 * @author Sean A. Irvine
 */
public class A073046 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 4) {
      return Z.FOUR;
    }
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mN - p;
      if (mPrime.isPrime(q)) {
        return Z.valueOf(p).multiply(q);
      }
    }
  }
}
