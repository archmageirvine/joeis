package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058049.
 * @author Sean A. Irvine
 */
public class A058050 implements Sequence {

  // It would be possible to squeeze one more bit here as bit 0 is not currently used.
  // It would be possible to cache smaller results to make it faster.

  private int mN = 0;

  private long count(final long bits, final int pos) {
    // pos counts down from the number of vertices
    // bits is a set indicating which vertices are not isolated, and thus
    // controls which vertices need to be expanded.
    if (pos <= 1) {
      return 1;
    }
    final long b = 1L << pos;
    if ((bits & b) == 0) {
      return count(bits, pos - 1);
    } else {
      long cnt = 0;
      for (int x = 1; x <= pos / 2; ++x) {
        cnt += count(bits | (1L << x) | 1L << (pos - x), pos - 1);
      }
      return cnt;
    }
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(count(1L << mN, mN));
  }
}
