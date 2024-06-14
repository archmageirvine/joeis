package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070829 Array showing which primes divide n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A070829 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (mM <= 1) {
      mM = ++mN;
      mP = 2;
    } else {
      mP = mPrime.nextPrime(mP);
    }
    Z cnt = Z.ZERO;
    while (mM % mP == 0) {
      cnt = Z.ONE;
      mM /= mP;
    }
    return cnt;
  }
}

