package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069941 Number of primes p such that n! &lt;= p &lt;= n! + n^2.
 * @author Sean A. Irvine
 */
public class A069941 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Z end = mF.add(mN * mN);
    Z t = mF.subtract(1);
    long count = 0;
    while ((t = mPrime.nextPrime(t)).compareTo(end) <= 0) {
      ++count;
    }
    return Z.valueOf(count);
  }
}
