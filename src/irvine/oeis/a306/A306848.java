package irvine.oeis.a306;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A306848 allocated for Zhandos Mambetaliyev.
 * @author Sean A. Irvine
 */
public class A306848 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      mN += 2;
    } while (mPrime.isPrime(mN));
    mA = mA.multiply(mN);
    return mA;
  }
}
