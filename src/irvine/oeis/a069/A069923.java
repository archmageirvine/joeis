package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069923 Number of primes p such that 2^n &lt;= p &lt;= 2^n + prime(n).
 * @author Sean A. Irvine
 */
public class A069923 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(++mN);
    mP = mPrime.nextPrime(mP);
    final Z end = t.add(mP);
    t = t.subtract(1); // -1 so nextPrime gets 2 when mN==1
    long count = 0;
    while ((t = mPrime.nextPrime(t)).compareTo(end) <= 0) {
      ++count;
    }
    return Z.valueOf(count);
  }
}
