package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007468.
 * @author Sean A. Irvine
 */
public class A007468 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mP = mPrime.nextPrime(mP);
    Z sum = mP;
    for (long k = 0; k < mN; ++k) {
      mP = mPrime.nextPrime(mP);
      sum = sum.add(mP);
    }
    return sum;
  }
}
