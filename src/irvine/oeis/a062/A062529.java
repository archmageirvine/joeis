package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062529 extends Sequence0 {

  // Only useful for a small number of terms

  private final Fast mPrime = new Fast();
  protected long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN * 2;
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.nextPrime(mP) - mP == mN) {
        return Z.valueOf(mP);
      }
    }
  }
}
