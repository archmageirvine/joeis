package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072555.
 * @author Sean A. Irvine
 */
public class A072745 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 8;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mN - mP;
      if (q > mP) {
        if (mPrime.isPrime(q)) {
          return Z.valueOf(q).multiply(mP);
        }
      } else {
        mP = mPrime.prevPrime(mP);
        mN *= 2;
      }
    }
  }
}
