package irvine.oeis.a132;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A132421 a(n) = LCM of the integers b(k), over all k where 1 &lt;= k &lt;= n, where b(k) = the k-th integer from among those positive integers which are coprime to (n+1-k).
 * @author Sean A. Irvine
 */
public class A132421 extends Sequence1 {

  private long mN = 0;

  private long b(final long n, long k) {
    final long t = n + 1 - k;
    long v = 0;
    while (k > 0) {
      if (Functions.GCD.l(++v, t) == 1) {
        --k;
      }
    }
    return v;
  }

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      lcm = lcm.lcm(Z.valueOf(b(mN, k)));
    }
    return lcm;
  }
}

