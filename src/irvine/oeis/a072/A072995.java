package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A072995 Least k &gt; 0 such that the number of solutions to x^k == 1 (mod k) 1 &lt;= x &lt;= k is equal to n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A072995 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mA = new A072994();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if ((mN & 1) == 0 && mN % (1L << (Functions.OMEGA.i(mN) - 1)) != 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long v = mA.next().longValueExact();
      if (mFirsts.get(v) == 0) {
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

