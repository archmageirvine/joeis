package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a045.A045763;
import irvine.util.array.DynamicLongArray;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070298 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 10;
  private final Sequence mA = new A045763();
  private final DynamicLongArray mCounts = new DynamicLongArray();
  private int mN = 0;
  private int mMax = 0;

  @Override
  public Z next() {
    ++mN;
    while (mMax < HEURISTIC * (mN + 1) * (mN + 1)) {
      final int v = mA.next().intValueExact();
      if (v > 0 && v < mN) {
        throw new RuntimeException("Previous output count for " + v + " was too small");
      }
      if (v > mMax) {
        mMax = v;
      }
      mCounts.increment(v);
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
