package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073920 a(1)=1 and then odd numbers rearranged such that a(n) is prime if n is composite else vice versa.
 * @author Sean A. Irvine
 */
public class A073920 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;
  private long mC = 7;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      while (true) {
        mC += 2;
        if (!mPrime.isPrime(mC)) {
          return Z.valueOf(mC);
        }
      }
    }
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mP);
  }
}

