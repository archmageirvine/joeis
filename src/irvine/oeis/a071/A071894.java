package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import irvine.factor.prime.Fast;
import irvine.math.z.ZUtils;

/**
 * A071894.
 * @author Sean A. Irvine
 */
public class A071894 implements Sequence {

  private final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z r = mP;
    while (true) {
      r = r.subtract(1);
      if (ZUtils.testPrimitiveRoot(r, mP)) {
        return r;
      }
    }
  }
}
