package irvine.oeis.a057;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057795 Sum k!, where sum is over positive integers k &lt;= n with gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A057795 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (IntegerUtils.gcd(mN, k) == 1) {
        sum = sum.add(Functions.FACTORIAL.z(k));
      }
    }
    return sum;
  }
}
