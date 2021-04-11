package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a007.A007770;

/**
 * A046519 Least n-digit 'happy' prime.
 * @author Sean A. Irvine
 */
public class A046519 extends A007770 {

  private final Fast mPrime = new Fast();
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(10);
    Z p = mT;
    while (true) {
      p = mPrime.nextPrime(p);
      if (isHappy(p)) {
        return p;
      }
    }
  }
}

