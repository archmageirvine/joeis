package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107109 n-th largest n-digit prime.
 * @author Sean A. Irvine
 */
public class A069100 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mT = null;

  @Override
  public Z next() {
    ++mN;
    mT = mT == null ? Z.ONE : mT.multiply(10);
    Z p = mT;
    for (int k = 0; k < mN; ++k) {
      p = mPrime.nextPrime(p);
    }
    return p;
  }
}
