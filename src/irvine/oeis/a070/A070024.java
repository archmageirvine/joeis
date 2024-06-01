package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070024 First prime &gt; 10^n in which every substring of length n is prime.
 * @author Sean A. Irvine
 */
public class A070024 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mU = Z.ONE;
  private Z mT = Z.ONE;

  private boolean is(Z p) {
    while (p.compareTo(mU) >= 0) {
      if (!p.mod(mT).isProbablePrime()) {
        return false;
      }
      p = p.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    mU = mT;
    mT = mT.multiply(10);
    Z p = mT;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p)) {
        return p;
      }
    }
  }
}
