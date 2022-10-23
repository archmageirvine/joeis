package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000849 Number of primes &lt;= product of first n primes, A002110(n).
 * @author Sean A. Irvine
 */
public class A000849 extends Sequence0 {

  private long mP = 0;
  private long mProd = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    // I don't know any fast way to do this ...
    if (mP == 0) {
      mP = 1;
      return Z.ZERO;
    }
    mP = mPrime.nextPrime(mP);
    mProd *= mP;
    if (mProd < 0) {
      throw new UnsupportedOperationException();
    }
    long c = 0;
    long p = 1;
    while ((p = mPrime.nextPrime(p)) <= mProd) {
      ++c;
    }
    return Z.valueOf(c);
  }
}

