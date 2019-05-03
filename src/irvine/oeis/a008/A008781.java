package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A008781 For any circular arrangement of <code>0..n-1</code>, let S = sum of cubes of every sum of two contiguous numbers; then <code>a(n) = #</code> of distinct values of S.
 * @author Sean A. Irvine
 */
public class A008781 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    // Precompute all relevant cubes of sums
    final long[][] cubes = new long[mN + 1][mN + 1];
    for (int k = 0; k <= mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        final long s = j + k;
        final long cube = s * s * s;
        cubes[k][j] = cube;
        cubes[j][k] = cube;
      }
    }
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    long count = 0;
    final Permutation perm = new Permutation(mN); // treat mN as fixed
    int[] p;
    while ((p = perm.next()) != null) {
      long sum = cubes[mN][p[0]] + cubes[mN][p[mN - 1]];
      for (int k = 1; k < p.length; ++k) {
        sum += cubes[p[k - 1]][p[k]];
      }
      if (!seen.isSet(sum)) {
        seen.set(sum);
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
