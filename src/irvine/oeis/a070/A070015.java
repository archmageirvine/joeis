package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070015 Least m such that the sum of the aliquot parts of m (A001065) equals n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A070015 extends Sequence0 {

  private long mN = -1;
  private long mM = 1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  {
    mFirsts.set(1L, 2);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    while (mM <= (mN - 1) * (mN - 1)) {
      final long index = Functions.SIGMA1.l(mM) - mM;
      if (index >= 0 && mFirsts.get(index) == 0) {
        mFirsts.set(index, mM);
      }
      ++mM;
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

