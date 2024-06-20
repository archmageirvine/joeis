package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070956 Number of pairs (x,y) such that n = gcd(x,y) + lcm(x,y).
 * @author Sean A. Irvine
 */
public class A070956 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      mCounts.increment(Functions.GCD.l(k, mN) + Functions.LCM.l(k, mN));
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
