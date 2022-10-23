package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006556 Number of different cycles of digits in the decimal expansions of 1/p, 2/p, ..., (p-1)/p where p = n-th prime different from 2 or 5.
 * @author Sean A. Irvine
 */
public class A006556 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.FIVE.equals(mP)) {
      mP = mPrime.nextPrime(mP);
    }
    long x = 0;
    Z y = Z.ONE;
    do {
      ++x;
      y = y.modMultiply(Z.TEN, mP);
    } while (!Z.ONE.equals(y));
    return mP.subtract(1).divide(x);
  }
}
