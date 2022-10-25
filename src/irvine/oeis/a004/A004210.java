package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A004210 "Magic" integers: a(n+1) is the smallest integer m such that there is no overlap between the sets {m, m-a(i), m+a(i): 1 &lt;= i &lt;= n} and {a(i), a(i)-a(j), a(i)+a(j): 1 &lt;= j &lt; i &lt;= n}.
 * @author Sean A. Irvine
 */
public class A004210 extends MemorySequence {

  {
    setOffset(1);
  }

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;

  private boolean isUsable(final long n) {
    if (mUsed.isSet(n)) {
      return false;
    }
    for (final Z v : this) {
      final long vv = v.longValueExact();
      if (mUsed.isSet(n - vv) || mUsed.isSet(n + vv)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    while (!isUsable(++mN)) {
      // do nothing
    }
    for (final Z v : this) {
      final long vv = v.longValueExact();
      mUsed.set(mN - vv);
      mUsed.set(mN + vv);
    }
    mUsed.set(mN);
    return Z.valueOf(mN);
  }
}
