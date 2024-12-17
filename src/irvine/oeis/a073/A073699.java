package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073699 Floor((Product of composite numbers up to n)/(product of primes up to n)).
 * @author Sean A. Irvine
 */
public class A073699 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Q mProd = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      mProd = mProd.divide(mN);
    } else {
      mProd = mProd.multiply(mN);
    }
    return mProd.toZ();
  }
}
