package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086284 Number of prime squares with maximum integer n (see comment for definition).
 * @author Sean A. Irvine
 */
public class A086284 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mCount = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      ++mCount;
    } else if (mN == 2) {
      mCount += 2;
    } else {
      for (long b = 1 + (mN & 1); b <= mN; ++b) {
        if (mPrime.isPrime(mN + b)) {
          for (long c = 1 + (b & 1); c <= mN; ++c) {
            if (mPrime.isPrime(b + c)) {
              for (long d = b; d <= mN; ++d) {
                if (mPrime.isPrime(c + d) && mPrime.isPrime(d + mN)) {
                  ++mCount;
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(mCount);
  }
}
