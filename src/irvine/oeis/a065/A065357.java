package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A065357 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private boolean mSign = true;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mSign = !mSign;
    }
    return mSign ? Z.ONE : Z.NEG_ONE;
  }
}
