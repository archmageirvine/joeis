package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A007343 Number of homogeneous primitive partition identities with largest part n.
 * @author Sean A. Irvine
 */
public class A007343 extends MemoryFunction2Sequence<Integer, Integer> {

  private int mN = 2;
  private Z mA = Z.ZERO;

  private void getPartitions(final List<int[]> result, final int[] current, final int maxPart, final int remaining) {
    if (remaining == 0) {
      result.add(current);
    } else {
      for (int k = maxPart; k > 0; --k) {
        final int[] next = Arrays.copyOf(current, current.length + 1);
        next[current.length] = k;
        getPartitions(result, next, k, remaining - 1);
      }
    }
  }

  private void subsums(final Set<Pair<Integer, Integer>> sums, final int[] a) {
    for (long syndrome = 1; syndrome < (1L << a.length) - 1; ++syndrome) {
      long t = syndrome;
      int sum = 0;
      int cnt = 0;
      int k = 0;
      while (t != 0) {
        if ((t & 1) == 1) {
          sum += a[k];
          ++cnt;
        }
        ++k;
        t >>= 1;
      }
      sums.add(new Pair<>(sum, cnt));
    }
  }

  private boolean isPrimitive(final int[] a, final int[] b) {
    // a.length == b.length is always true by our construction
//    if (a.length != b.length) {
//      return false;
//    }
    // This quick test gets a lot of bad cases
    for (final int u : a) {
      for (final int v : b) {
        if (u == v) {
          return false;
        }
      }
    }

    final HashSet<Pair<Integer, Integer>> sumsA = new HashSet<>();
    final HashSet<Pair<Integer, Integer>> sumsB = new HashSet<>();
    subsums(sumsA, a);
    subsums(sumsB, b);
    for (final Pair<Integer, Integer> as : sumsA) {
      if (sumsB.contains(as)) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Integer compute(final Integer maxPart, final Integer degree) {
    final ArrayList<int[]> parts = new ArrayList<>();
    getPartitions(parts, new int[0], maxPart, degree);
    final long[] sums = new long[parts.size()];
    for (int k = 0; k < sums.length; ++k) {
      sums[k] = IntegerUtils.sum(parts.get(k));
    }
    int count = 0;
    for (int k = 0; k < sums.length; ++k) {
      final int[] a = parts.get(k);
      final long as = sums[k];
      if (a[0] == maxPart) {
        for (int j = k + 1; j < sums.length; ++j) {
          if (sums[j] == as && isPrimitive(a, parts.get(j))) {
            ++count;
          }
        }
      }
    }
    return count;
  }

  @Override
  public Z next() {
    ++mN;
    for (int d = 1; d < mN; ++d) {
      mA = mA.add(get(mN, d));
    }
    return mA;
  }
}
