package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A067004 Number of numbers &lt;= n with same number of divisors as n.
 * @author Sean A. Irvine
 */
public class A067004 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long omega = Jaguar.factor(++mN).sigma0AsLong();
    return Z.valueOf(mCounts.add(omega, 1));
  }
}

