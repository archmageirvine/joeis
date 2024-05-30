package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036997 Number of composite numbers &lt;= n and relatively prime to n.
 * @author Sean A. Irvine
 */
public class A036997 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 4; k <= mN; ++k) {
      if (!mPrime.isPrime(k) && Functions.GCD.l(k, mN) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
