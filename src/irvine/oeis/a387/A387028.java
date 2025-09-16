package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a262.A262690;
import irvine.util.array.LongDynamicLongArray;

/**
 * A387028 allocated for J. Lowell.
 * @author Sean A. Irvine
 */
public class A387028 extends Sequence1 {

  private final Sequence mA = new A262690();
  private final LongDynamicLongArray mLastOccurrences = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long lim = 4 * mN * mN;
    while (mM <= lim) {
      mLastOccurrences.set(Functions.SQRT.l(mA.next()), ++mM);
    }
    return Z.valueOf(mLastOccurrences.get(mN));
  }
}
