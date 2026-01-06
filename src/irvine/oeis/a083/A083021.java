package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083021 a(n) = the number of distinct primes of the form p(n)#/p(i) + p(i).
 * @author Sean A. Irvine
 */
public class A083021 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mProd = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mProd = mProd.multiply(mP);
    if (mP == 3) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long q = 2; q <= mP; q = mPrime.nextPrime(q)) {
      if (mProd.divide(q).add(q).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
