package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A044813 Positive integers having distinct base-2 run lengths.
 * @author Sean A. Irvine
 */
public class A044813 extends Sequence1 {

  private long mN = 0;
  // We reuse the following workspace to detect repeated run lengths for
  // a given mN.  That is, it is like a boolean, but we use mN to avoid
  // the need to clear it.
  private final long[] mSeenWorkspace = new long[100];

  protected int base() {
    return 2;
  }

  private boolean isDistinctRunLengths(final long n) {
    long prev = -1;
    int len = 0;
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else if (mSeenWorkspace[len] == mN) {
        return false;
      } else {
        mSeenWorkspace[len] = mN;
        prev = r;
        len = 1;
      }
      m /= base();
    }
    return mSeenWorkspace[len] != mN;
  }

  @Override
  public Z next() {
    while (true) {
      if (isDistinctRunLengths(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

