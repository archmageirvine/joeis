package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A065561 a(1) = 1; for n &gt;= 2, a(n) = (d(n)-1)-th highest positive integer that equals no a(k), 1 &lt;= k &lt; n, where d(n) is the number of positive divisors of n, A000005(n).
 * @author Sean A. Irvine
 */
public class A065561 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;
  private long mMin = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      mSeen.set(1);
      return Z.ONE;
    }
    while (mSeen.isSet(mMin)) {
      ++mMin;
    }
    long s = Functions.SIGMA0.l(mN) - 1;
    long k = mMin - 1;
    while (s > 0) {
      do {
        ++k;
      } while (mSeen.isSet(k));
      --s;
    }
    mSeen.set(k);
    return Z.valueOf(k);
  }
}
