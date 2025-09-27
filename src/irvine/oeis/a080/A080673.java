package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a025.A025429;
import irvine.util.array.LongDynamicLongArray;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A080673 extends Sequence0 implements Conjectural {

  private static final long HEURISTIC = 50;
  private final LongDynamicLongArray mLasts = new LongDynamicLongArray();
  private final Sequence mS = new A025429();
  private long mN = -1;
  private long mM = -1;

  @Override
  public Z next() {
    ++mN;
    while (mM < HEURISTIC * (mN + 1)) {
      final long v = mS.next().longValueExact();
      mLasts.set(v, ++mM);
      if (v < mN) {
        throw new RuntimeException("Heuristic failed: previously output value for " + v + " should be at least " + mM);
      }
    }
    return Z.valueOf(mLasts.get(mN));
  }
}
