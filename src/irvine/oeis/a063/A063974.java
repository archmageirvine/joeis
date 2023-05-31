package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A063974 Number of terms in inverse set of usigma = sum of unitary divisors = A034448.
 * @author Sean A. Irvine
 */
public class A063974 extends Sequence1 {

  private final LongDynamicLongArray mCnts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      final long v = Jaguar.factor(++mM).unitarySigma().longValueExact();
      mCnts.set(v, mCnts.get(v) + 1);
    }
    return Z.valueOf(mCnts.get(mN));
  }
}
