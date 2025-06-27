package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a008.A008784;

/**
 * A078332 First prime such that p^2 == -1 (mod n), or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A078332 extends A008784 {

  private Z mAllowed = super.next();
  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z m = mN;
    mN = mN.add(1);
    if (!mN.equals(mAllowed)) {
      return Z.ZERO;
    }
    mAllowed = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.modSquare(mN).equals(m)) {
        return p;
      }
    }
  }
}

