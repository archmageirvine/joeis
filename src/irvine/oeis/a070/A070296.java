package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a048.A048865;
import irvine.util.array.DynamicLongArray;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070296 extends Sequence0 {

  private final Sequence mA = new A048865();
  private final DynamicLongArray mCounts = new DynamicLongArray();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mCounts.get(2 * mN + 1) == 0) {
      final int v = mA.next().intValueExact();
      if (v < mN) {
        throw new RuntimeException("Previous output count for " + v + " was too small");
      }
      mCounts.increment(v);
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
