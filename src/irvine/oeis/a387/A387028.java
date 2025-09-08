package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a262.A262690;
import irvine.util.array.LongDynamicLongArray;

/**
 * A387028 allocated for J. Lowell.
 * @author Sean A. Irvine
 */
public class A387028 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 100;
  private final Sequence mA = new A262690();
  private final LongDynamicLongArray mLastOccurrences = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long lim = mN == 0 ? 1 : HEURISTIC * mLastOccurrences.get(mN - 1) + HEURISTIC;
    while (mM < lim) {
      final long v = Functions.SQRT.l(mA.next());
      if (v < mN) {
        throw new RuntimeException("Heuristic failed, previously reported value for " + v + " was incorrect should be >= " + mM);
      }
      mLastOccurrences.set(v, ++mM);
    }
    return Z.valueOf(mLastOccurrences.get(mN));
  }
}
