package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064555 a(n) = max { k | A064553(k) = n }.
 * @author Sean A. Irvine
 */
public class A064555 extends A064553 implements Conjectural {

  private static final int HEURISTIC_STEPS = 1000;
  private final LongDynamicLongArray mLasts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC_STEPS; ++k) {
      ++mM;
      final long t = super.next().longValueExact();
      if (t <= mN) {
        throw new RuntimeException("Heuristic failed: " + t + " should have been at least " + mM);
      }
      mLasts.set(t, mM);
    }
    return Z.valueOf(mLasts.get(++mN));
  }
}

