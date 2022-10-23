package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A071894 Largest positive primitive root (&lt;p) of n-th prime p.
 * @author Sean A. Irvine
 */
public class A071894 extends Sequence1 {

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
