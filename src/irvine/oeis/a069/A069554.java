package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A069554 Smallest k &gt; 0 with gcd(k, rev(k)) = n, where rev(k) is digit reversal of k, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A069554 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long g = Functions.GCD.l(++mM, Functions.REVERSE.l(mM));
      if (mFirsts.get(g) == 0) {
        mFirsts.set(g, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
