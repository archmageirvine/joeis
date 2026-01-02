package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391280 Array read by ascending antidiagonals: T(n,k) is the number of primes p in the range n*(k-1) &lt; p &lt;= n*k.
 * @author Sean A. Irvine
 */
public class A391280 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Functions.PRIME_PI.z(n * m).subtract(Functions.PRIME_PI.z(n * (m - 1)));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
