package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014089.
 * @author Sean A. Irvine
 */
public class A014089 implements Sequence {

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
