package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A002233 a(1) = 1; for n &gt; 1, a(n) = least positive prime primitive root of n-th prime.
 * @author Sean A. Irvine
 */
public class A002233 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mPrime.nextPrime(mN);
    if (Z.TWO.equals(mN)) {
      return Z.ONE;
    }
    Z n = Z.ONE;
    while (true) {
      n = mPrime.nextPrime(n);
      if (ZUtils.testPrimitiveRoot(n, mN)) {
        return n;
      }
    }
  }
}
