package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006556 Number of different cycles of digits in the decimal expansions of <code>1/p, 2/p</code>, ..., <code>(p-1)/p</code> where p <code>= n-th</code> prime different from 2 or 5.
 * @author Sean A. Irvine
 */
public class A006556 implements Sequence {

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
