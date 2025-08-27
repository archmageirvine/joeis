package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A079788 a(n) = count of numbers &lt;= n for which the number of divisors is also &lt;= tau(n).
 * @author Sean A. Irvine
 */
public class A079788 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    long s = Functions.SIGMA0.l(++mN);
    Z sum = Z.valueOf(mCounts.increment(s));
    while (--s > 0) {
      sum = sum.add(mCounts.get(s));
    }
    return sum;
  }
}

