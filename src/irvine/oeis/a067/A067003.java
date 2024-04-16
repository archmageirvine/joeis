package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A067003 Number of numbers &lt;= n with same number of distinct prime factors as n.
 * @author Sean A. Irvine
 */
public class A067003 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final int omega = Functions.OMEGA.i(++mN);
    return Z.valueOf(mCounts.add(omega, 1));
  }
}

