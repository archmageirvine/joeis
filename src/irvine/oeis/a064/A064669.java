package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064669 Regard A064413 as giving a permutation of the positive integers; sequence gives (presumed) smallest term in each cycle of this permutation.
 * @author Sean A. Irvine
 */
public class A064669 extends Sequence1 implements Conjectural {

  private static final long LIMIT = 1 << 16;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final MemorySequence mA = MemorySequence.cachedSequence(new A064413());
  private final MemorySequence mB = MemorySequence.cachedSequence(new A064664());
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= LIMIT) {
        throw new UnsupportedOperationException("Increase LIMIT to try harder");
      }
      if (!mSeen.isSet(mN)) {
        int m = (int) mN;
        while (m < LIMIT && !mSeen.isSet(m)) {
          mSeen.set(m);
          m = mA.a(m - 1).intValueExact();
        }
        m = (int) mN;
        do {
          mSeen.set(m);
          m = mB.a(m - 1).intValueExact();
        } while (!mSeen.isSet(m) && m < LIMIT);
        return Z.valueOf(mN);
      }
    }
  }
}
