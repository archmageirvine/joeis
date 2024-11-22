package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073284.
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

