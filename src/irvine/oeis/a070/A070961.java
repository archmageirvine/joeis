package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070961 a(n) = Card{ k&lt;=n | bigomega(k) != bigomega(n) }.
 * @author Sean A. Irvine
 */
public class A070961 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long bigOmega = Functions.BIG_OMEGA.l(++mN);
    return Z.valueOf(mN - mCounts.increment(bigOmega));
  }
}
