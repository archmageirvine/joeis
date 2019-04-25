package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A004210 "Magic" integers: <code>a(n+1)</code> is the smallest integer m such that there is no overlap between the sets {m, m-a(i), m+a(i): <code>1 &lt;= i &lt;= n}</code> and <code>{a(i), a(i)-a(j), a(i)+a(j)</code>: <code>1 &lt;= j &lt; i &lt;= n}</code>.
 * @author Sean A. Irvine
 */
public class A004210 extends MemorySequence {

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
