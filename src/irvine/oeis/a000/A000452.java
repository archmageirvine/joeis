package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A000452 The greedy sequence of integers which avoids 3-term geometric progressions.
 * @author Sean A. Irvine
 */
public class A000452 implements Sequence {

  private long mN = 0;
  private final DynamicIntArray mEliminated = new DynamicIntArray();

  private void eliminate(final long n) {
    final int bit = (int) (n & 0x1F);
    final int key = (int) (n >>> 5);
    mEliminated.set(key, mEliminated.get(key) | (1 << bit));
  }

  private boolean isEliminated(final long n) {
    final int bit = (int) (n & 0x1F);
    final int key = (int) (n >>> 5);
    return (mEliminated.get(key) & (1 << bit)) != 0;
  }

  @Override
  public Z next() {
    while (isEliminated(++mN)) {
      // do nothing
    }
    for (long k = 2; k <= mN; ++k) {
      if (mN % k == 0 && !isEliminated(mN / k)) {
        eliminate(mN * k);
      }
    }
    return Z.valueOf(mN);
  }
}
