package irvine.oeis.a132;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A132421 <code>a(n) =</code> LCM of the integers b(k), over all k where <code>1 &lt;=</code> k <code>&lt;= n,</code> where b(k) = the k-th integer from among those positive integers which are coprime to (n+1-k).
 * @author Sean A. Irvine
 */
public class A132421 implements Sequence {

  private long mN = 0;

  private long b(final long n, long k) {
    final long t = n + 1 - k;
    long v = 0;
    while (k > 0) {
      if (LongUtils.gcd(++v, t) == 1) {
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

