package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A000448.
 * @author Sean A. Irvine
 */
public class A000448 implements Sequence {

  private int mN = 0;
  private final DynamicLongArray mSeen = new DynamicLongArray();

  private int count(final long n) {
    long b = (long) Math.sqrt(0.5 * n);
    int c = 0;
    while (true) {
      final long bsq = b * b;
      if (bsq > n) {
        break;
      }
      final long d = n - bsq;
      if (d <= bsq) {
        final long r = LongUtils.sqrt(d);
        if (r * r == d) {
          ++c;
        }
      }
      ++b;
    }
    if (mSeen.get(c) == 0) {
      mSeen.set(c, n);
    }
    return c;
  }

  protected boolean accept(final int count, final int n) {
    return count >= n;
  }

  @Override
  public Z next() {
    final long q = mSeen.get(++mN);
    if (q != 0) {
      return Z.valueOf(q);
    }
    long pos = -1;
    while (true) {
      if (accept(count(++pos), mN)) {
        return Z.valueOf(pos);
      }
    }
  }
}
