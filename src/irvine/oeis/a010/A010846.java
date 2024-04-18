package irvine.oeis.a010;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010846 Number of numbers &lt;= n whose set of prime factors is a subset of the set of prime factors of n.
 * @author Sean A. Irvine
 */
public class A010846 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(Functions.MOBIUS.i(k) * (mN / k));
      }
    }
    return sum;
  }
}
