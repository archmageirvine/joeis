package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002444 Denominator in Feinler's formula for unsigned Bernoulli number |B_{2n}|.
 * @author Sean A. Irvine
 */
public class A002444 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    Z prod = Z.ONE;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long e = mN / (p - 1);
      if (e == 0) {
        break;
      }
      prod = prod.multiply(Z.valueOf(p).pow(e));
    }
    return prod.divide(mF);
  }
}
