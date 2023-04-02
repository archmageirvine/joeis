package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062531 extends Sequence0 {

  private final Fast mPrime = new Fast();
  protected long mN = 1;
  private long mP = 1;
  private long mPi = 0;

  @Override
  public Z next() {
    mN *= 2;
    while (true) {
      ++mPi;
      mP = mPrime.nextPrime(mP);
      if (mPrime.nextPrime(mP) - mP == mN) {
        return Z.valueOf(mPi);
      }
    }
  }
}
