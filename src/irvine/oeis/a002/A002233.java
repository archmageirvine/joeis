package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002233.
 * @author Sean A. Irvine
 */
public class A002233 implements Sequence {

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
