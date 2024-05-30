package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057792 Sum[k^k], where sum is over positive integers, k, where k &lt;= n and gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A057792 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        sum = sum.add(Z.valueOf(k).pow(k));
      }
    }
    return sum;
  }
}
