package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.util.array.LongDynamicLongArray;

/**
 * A077566 Smallest number which can be factored into parts with distinct prime signatures in n different ways, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077566 extends A077565 implements Conjectural {

  private static final long HEURISTIC = 1 << 17; // a(64) requires 1 << 16
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (mM > HEURISTIC * mN) {
        return Z.ZERO;
      }
      ++mM;
      final long t = super.next().longValueExact();
      if (mFirsts.get(t) == 0) {
        if (t < mN) {
          throw new RuntimeException("Heuristic failed: " + t + " previously reported as 0 should be " + mM);
        }
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
