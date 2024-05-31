package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078923.
 * @author Sean A. Irvine
 */
public class A070015 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  {
    mFirsts.set(1L, 2);
  }

  @Override
  public Z next() {
    ++mN;
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

