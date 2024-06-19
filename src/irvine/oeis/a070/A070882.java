package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A070882 Least k such that A070867(k) = n, or 0 if no such k exist.
 * @author Sean A. Irvine
 */
public class A070882 extends Sequence1 {

  private static final long HEURISTIC = 10;
  private int mN = 0;
  private long mM = 0;
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mA = new A070867();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 && mM < HEURISTIC * mN) {
      ++mM;
      final int v = mA.next().intValueExact();
      if (mFirsts.get(v) == 0) {
        if (v < mN) {
          throw new RuntimeException("Heuristic failed, " + v + " previously reported as 0 should be " + mM);
        }
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
