package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065625 Table of permutations of N, each row being a generator of the "rotation group" of infinite planar binary tree. Inverse generators are given in A065626.
 * @author Sean A. Irvine
 */
public class A065625 extends Sequence0 {

  // After Antti Karttunen

  private long mN = -1;

  private long trinv(final long n) {
    return (LongUtils.sqrt(8L * n + 1) + 1) / 2;
  }

  protected long rotateNodeRight(final long t, final long x) {
    final long u = LongUtils.lg(t) + 1;
    final long y = LongUtils.lg(x) + 1;
    if (y < u) {
      return x;
    }
    if (x / (1L << (y - u)) != t) {
      return x;
    }
    if (x == t) {
      return 2 * x + 1;
    }
    if (1 == ((x / (1L << (y - u - 1))) & 1)) {
      return x + (t << (y - u)) + (1L << (y - u));
    }
    if (y == u + 1) {
      return x / 2;
    }
    if (1 == ((x / (1L << (y - u - 2))) & 1)) {
      return x + (1L << (y - u - 2));
    }
    return x - (t << (y - u - 1));
  }

  @Override
  public Z next() {
    final long t = trinv(++mN);
    return Z.valueOf(rotateNodeRight(1 + (mN - ((t * (t - 1)) / 2)), (((t - 1) * (t + 2) / 2) - mN) + 1));
  }
}
