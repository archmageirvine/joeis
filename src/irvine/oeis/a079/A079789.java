package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A079789 a(n) = number of nonnegative integers m &lt;= n having at least one digit in common with n.
 * @author Sean A. Irvine
 */
public class A079789 extends Sequence0 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    final int s = Functions.SYNDROME.i(++mN);
    mCounts.increment(s);
    Z sum = Z.ZERO;
    for (int k = 1; k < mCounts.length(); ++k) {
      if ((k & s) != 0) {
        sum = sum.add(mCounts.get(k));
      }
    }
    return sum;
  }
}

