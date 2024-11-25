package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073316 a(n) = Max d(j), j=1..n-1, where d(j) is the smallest positive number such that 2j+d(j) and 2n+d(j) are both prime. A generalization of A073310.
 * @author Sean A. Irvine
 */
public class A073316 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long max = 0;
    for (long j = 1; j < mN; ++j) {
      long k = -1;
      while (true) {
        k += 2;
        if (mPrime.isPrime(k + 2 * j) && mPrime.isPrime(2 * mN + k)) {
          if (k > max) {
            max = k;
          }
          break;
        }
      }
    }
    return Z.valueOf(max);
  }
}

