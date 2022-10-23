package irvine.oeis.a165;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A165430 Table T(n,m) read by rows: the greatest common unitary divisor of n and m, n&gt;=1, 1&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A165430 extends Sequence1 {

  /**
   * The greatest common unitary divisor function
   * @param m first argument
   * @param n second argument
   * @return greatest common unitary divisors
   */
  public static long gcud(final long m, final long n) {
    for (long k = Math.min(m, n); k > 0; --k) {
      if (m % k == 0 && n % k == 0 && LongUtils.gcd(k, m / k) == 1 && LongUtils.gcd(k, n / k) == 1) {
        return k;
      }
    }
    return 1;
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(gcud(mM, mN));
  }
}
