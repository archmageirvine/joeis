package irvine.oeis.a107;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107109 n-th largest n-digit prime.
 * @author Sean A. Irvine
 */
public class A107109 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mT = mT.multiply(10);
    Z p = mT;
    for (int k = 0; k < mN; ++k) {
      p = mPrime.prevPrime(p);
    }
    return p;
  }
}
