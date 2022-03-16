package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A055211 Lesser Fortunate numbers.
 * @author Sean A. Irvine
 */
public class A055211 extends A002110 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (Z.SIX.equals(t)) {
      return Z.THREE;
    }
    mP = mPrime.nextPrime(mP);
    long k = mP - 2;
    while (!t.subtract(++k).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
