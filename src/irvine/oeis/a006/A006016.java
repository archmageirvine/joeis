package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A006016 The nim value for the game of Sym with n tails and 1 head.
 * @author Sean A. Irvine
 */
public class A006016 extends Sequence0 {

  // Use bit 0 to track if the value has been computed
  private final LongDynamicLongArray mCache = new LongDynamicLongArray();
  {
    mCache.set(0, 1);
  }

  private void symFlips(final long k, final int leftMost, final int length, final HashSet<Long> newMex, final int n) {
    assert length > 0;
    // Can either use leftMost or not
    // Use it
    long t = k ^ (1L << (n - leftMost));
    if (length != 1) {
      t ^= 1L << (n - leftMost - length + 1);
    }
    newMex.add(getValue(t, n));
    // Don't use it
    for (int left = leftMost + 1, len = length - 2; len > 0; ++left, len -= 2) {
      symFlips(t, left, len, newMex, n);
    }
  }

  private long compute(final long key, final int n) {
    // Handle leading "tails"
    if ((key & (1L << n)) == 0) {
      return getValue(key, n - 1);
    }
    // Handle leading "heads"
    final HashSet<Long> seen = new HashSet<>();
    long m = 1L << n;
    for (int leftMost = 0; leftMost <= n; ++leftMost, m >>>= 1) {
      if ((key & m) != 0) {
        for (int length = 1; length + leftMost <= n + 1; ++length) {
          symFlips(key, leftMost, length, seen, n);
        }
      }
    }
    return LongUtils.mex(seen);
  }

  private long getValue(final long key, final int n) {
    final long nimValue = mCache.get(key);
    if ((nimValue & 1) == 1) {
      return nimValue >>> 1;
    }
    final long r = compute(key, n);
    mCache.set(key, (r << 1) + 1);
    return r;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(getValue(1L << ++mN, mN));
  }
}

