package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069922 Number of primes p such that n^n &lt;= p &lt;= n^n + n^2.
 * @author Sean A. Irvine
 */
public class A069922 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN).pow(mN);
    final Z end = t.add(mN * mN);
    long count = 0;
    while ((t = mPrime.nextPrime(t)).compareTo(end) <= 0) {
      ++count;
    }
    return Z.valueOf(count);
  }
}
