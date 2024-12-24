package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073837 Sum of primes p satisfying n &lt;= p &lt;= 2n.
 * @author Sean A. Irvine
 */
public class A073837 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = mPrime.nextPrime(mN - 1); k <= 2 * mN; k = mPrime.nextPrime(k)) {
      sum = sum.add(k);
    }
    return sum;
  }
}
