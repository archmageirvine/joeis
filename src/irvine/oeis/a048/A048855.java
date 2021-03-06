package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048855 Number of integers up to n! relatively prime to n!.
 * @author Sean A. Irvine
 */
public class A048855 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mPrime.isPrime(mN) ? mA.multiply(mN - 1) : mA.multiply(mN);
    }
    return mA;
  }
}

