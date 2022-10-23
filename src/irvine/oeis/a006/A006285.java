package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006285 Odd numbers not of form p + 2^k (de Polignac numbers).
 * @author Sean A. Irvine
 */
public class A006285 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      long t = 1;
      while (true) {
        if (mN - t <= 0) {
          return Z.valueOf(mN);
        }
        if (mPrime.isPrime(mN - t)) {
          break;
        }
        t <<= 1;
      }
    }
  }
}
