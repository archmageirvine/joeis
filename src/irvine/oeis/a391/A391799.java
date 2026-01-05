package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391799 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391799 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long q = mPrime.nextPrime(mP);
      mP = mPrime.nextPrime(q); // p(2k)
      final long r = mPrime.nextPrime(mP);
      if (mPrime.nextPrime(r) - mP > r - q) {
        return Z.valueOf(mN);
      }
    }
  }
}
