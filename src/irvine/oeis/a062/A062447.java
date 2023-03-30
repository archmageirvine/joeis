package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062447 Prime numbers at large subscripts: a(n) = prime(q(n)), where q(n) = A002110(n).
 * @author Sean A. Irvine
 */
public class A062447 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mPrimorial = 1;
  private long mP = 2;
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.TWO;
    }
    mN = mPrime.nextPrime(mN);
    if (mN > 47) {
      throw new UnsupportedOperationException();
    }
    mPrimorial *= mN;
    while (mM < mPrimorial) {
      ++mM;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
