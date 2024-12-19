package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073818 a(n) = max(prime(i)*(n+1-i) | 1 &lt;= i &lt;= n).
 * @author Sean A. Irvine
 */
public class A073818 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      max = max.max(Z.valueOf(p).multiply(mN + 1 - k));
    }
    return max;
  }
}
