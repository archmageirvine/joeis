package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006556.
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
