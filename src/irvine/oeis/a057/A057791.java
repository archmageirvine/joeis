package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057791 Sum[k^(n-k)], where sum is over positive integers, k, where k &lt;= n and gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A057791 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        sum = sum.add(Z.valueOf(k).pow(mN - k));
      }
    }
    return sum;
  }
}
