package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007619 Wilson quotients: ((p-1)! + 1)/p where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A007619 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    do {
      mF = mF.multiply(mN);
      ++mN;
    } while (!mPrime.isPrime(mN));
    return mF.add(1).divide(mN);
  }
}

