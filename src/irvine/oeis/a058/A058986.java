package irvine.oeis.a058;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A058986 Sorting by prefix reversal (or "flipping pancakes"). You can only reverse segments that include the initial term of the current permutation; a(n) is the number of reversals that are needed to transform an arbitrary permutation of n letters to the identity permutation.
 * @author Sean A. Irvine
 */
public class A058986 extends Sequence1 {

  private int mN = 0;

  // cf. http://www.geekviewpoint.com/java/numbers/permutation_index
  private long index(final int[] perm) {
    long index = 0;
    int pos = 2;
    long factor = 1;
    for (int k = perm.length - 2; k >= 0; --k) {
      int successors = 0;
      for (int q = k + 1; q < perm.length; ++q) {
        if (perm[k] > perm[q]) {
          ++successors;
        }
      }
      index += successors * factor;
      factor *= pos;
      ++pos;
    }
    return index;
  }

  @Override
  public Z next() {
    ++mN;
    final int[] perm = IntegerUtils.identity(new int[mN]);
    final LongDynamicIntArray seen = new LongDynamicIntArray();
    seen.set(index(perm), 1); // Offset by 1, we use 0 to indicate not yet seen
    final Deque<int[]> queue = new LinkedList<>();
    queue.add(perm);
    int max = 0;
    while (!queue.isEmpty()) {
      final int[] p = queue.pollFirst();
      max = seen.get(index(p));
      for (int k = 2; k <= p.length; ++k) { // exclusive end-point of reversal
        final int[] q = Arrays.copyOf(p, p.length);
        for (int j = 0, i = k - 1; i >= 0; ++j, --i) {
          q[j] = p[i];
        }
        final long idx = index(q);
        if (seen.get(idx) == 0) {
          seen.set(idx, max + 1);
          queue.add(q);
        }
      }
    }
    return Z.valueOf(max - 1);
  }
}
