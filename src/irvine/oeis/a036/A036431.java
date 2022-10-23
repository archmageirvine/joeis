package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A036431 a(n) = number of positive integers b which, when added to the number of their divisors, tau(b), gives n.
 * @author Sean A. Irvine
 */
public class A036431 extends Sequence1 {

  private final LongDynamicLongArray mCnt = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long m = ++mN + Jaguar.factor(mN).sigma0().longValueExact();
    mCnt.set(m, mCnt.get(m) + 1);
    return Z.valueOf(mCnt.get(mN));
  }
}
