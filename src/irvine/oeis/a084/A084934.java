package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084934 Rectangular array T(m,n) (m&gt;=1, n&gt;=1) read by antidiagonals: row m consists of the numbers ( i + mj : i &gt;= 0, j &gt;= 0 ), sorted in increasing order, with repetitions allowed.
 * @author Sean A. Irvine
 */
public class A084934 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicLongArray mB = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mB.set(mN, 1);
      mM = 0;
    }
    final long res = mA.get(mM);
    if (mB.add(mM, -1) <= 0) {
      mB.set(mM, mA.increment(mM) / (mM + 1) + 1);
    }
    return Z.valueOf(res);
  }
}

