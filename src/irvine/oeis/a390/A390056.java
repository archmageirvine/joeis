package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A390056 Smallest k for which a chain of linked rods of length 1, ..., k can be folded in half in exactly n dictinct ways.
 * @author Sean A. Irvine
 */
public class A390056 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 2;

  private long count(final long m) {
    final long t = m * (m + 1) / 2;
    if ((t & 1) == 1) {
      return 0;
    }
    final long half = t / 2;
    long count = 0;
    long s = 0;
    long k = 0;
    long j = 0;
    while (k != m) {
      while (s < half) {
        s += ++k;
      }
      while (s > half) {
        s -= ++j;
      }
      if (s == half) {
        if (j != 0) { // j==0 test stops counting things like (1)(2) = (3) twice
          ++count;
        }
        s -= ++j;
      }
    }
    return count;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long count = count(++mM);
      if (mFirsts.get(count) == 0) {
        mFirsts.set(count, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
