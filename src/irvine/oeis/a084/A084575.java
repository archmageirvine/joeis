package irvine.oeis.a084;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084575 Number of terms in the polynomial expression for the determinant of generic circulant matrix of order n.
 * @author Sean A. Irvine
 */
public class A084575 extends Sequence1 {

  private int mN = 0;

  private static Z encode(final int[] counts, final int n) {
    Z key = Z.ZERO;
    for (int i = 0; i < n; ++i) {
      key = key.multiply(n + 1).add(counts[i]);
    }
    return key;
  }

  private static void dfs(final int i, final long usedCols, final int parity, final int[] counts, final int n, final Map<Z, Integer> map) {
    if (i == n) {
      final Z key = encode(counts, n);
      final int sign = (parity == 0) ? 1 : -1;
      map.merge(key, sign, Integer::sum);
      return;
    }

    for (int j = 0; j < n; ++j) {
      final long bit = 1L << j;
      if ((usedCols & bit) != 0) {
        continue;
      }

      // update parity: count how many used columns > j
      final int inv = Long.bitCount(usedCols >>> (j + 1));
      final int newParity = parity ^ (inv & 1);
      int k = i + j;
      if (k >= n) {
        k -= n;
      }
      ++counts[k];
      dfs(i + 1, usedCols | bit, newParity, counts, n, map);
      --counts[k];
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Map<Z, Integer> map = new HashMap<>();
    dfs(0, 0L, 0, new int[mN], mN, map);
    return Z.valueOf(map.values().stream().filter(v -> v != 0).count());
  }
}

