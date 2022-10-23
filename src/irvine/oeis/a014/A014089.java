package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014089 Sum of a square and a prime.
 * @author Sean A. Irvine
 */
public class A014089 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 0; k * k < mN; ++k) {
        if (mPrime.isPrime(mN - k * k)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
