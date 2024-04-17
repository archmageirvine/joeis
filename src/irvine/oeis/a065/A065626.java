package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065626 Table of permutations of N, each row being a generator of the "rotation group" of infinite planar binary tree. Inverse generators are given in A065625.
 * @author Sean A. Irvine
 */
public class A065626 extends Sequence0 {

  // After Antti Karttunen

  private long mN = -1;

  protected long rotateNodeLeft(final long t, final long x) {
    final long u = LongUtils.log2(t) + 1;
    final long y = LongUtils.log2(x) + 1;
    if (y < u) {
      return x;
    }
    if (x / (1L << (y - u)) != t) {
      return x;
    }
    if (x == t) {
      return 2 * x;
    }
    if (0 == ((x / (1L << (y - u - 1))) & 1)) {
      return x + (t << (y - u));
    }
    if (y == u + 1) {
      return (x - 1) / 2;
    }
    if (0 == ((x / (1L << (y - u - 2))) & 1)) {
      return x - (1L << (y - u - 2));
    }
    return x - ((t + 1) << (y - u - 1));
  }

  @Override
  public Z next() {
    final long n = ++mN;
    final long t = Functions.TRINV.l(n);
    return Z.valueOf(rotateNodeLeft(1 + (mN - ((t * (t + 1)) / 2)), ((t * (t + 3) / 2) - mN) + 1));
  }
}
