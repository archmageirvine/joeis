package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056896 Smallest prime which can be written as k^2 + n for k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A056896 implements Sequence {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (!mPrime.isPrime(mN + ++k * k)) {
      // do nothing
    }
    return Z.valueOf(mN + k * k);
  }
}
