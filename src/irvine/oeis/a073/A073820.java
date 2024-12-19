package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073820 a(n) = n+1-i such that prime(i)*(n+1-i) is maximized (1 &lt;= i &lt;= n).
 * @author Sean A. Irvine
 */
public class A073820 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    long maxV = 0;
    for (long k = 1, p = 2; k <= mN; ++k, p = mPrime.nextPrime(p)) {
      final Z t = Z.valueOf(p).multiply(mN + 1 - k);
      if (t.compareTo(max) > 0) {
        max = t;
        maxV = mN + 1 - k;
      }
    }
    return Z.valueOf(maxV);
  }
}
