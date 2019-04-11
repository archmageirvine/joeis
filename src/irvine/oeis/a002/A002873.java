package irvine.oeis.a002;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002873 The maximal number of partitions of <code>{1..2n}</code> that are invariant under a permutation consisting of n 2-cycles, and which have the same number of nonempty parts.
 * @author Sean A. Irvine
 */
public class A002873 implements Sequence {

  // This supposedly easy sequence is very hard to understand.
  // The following implementation is based on the description in the example
  // provided by Jorgen Backelin.
  // Generates all set partitions, testing required property

  private int mN = -1;

  /*
   * Generate partitions. s[] says which set each element belong to. The array m[]
   * keeps track of the maximum set index, r is the maximum number of sets (parts)
   * to generate. To generate all possibilities set r = n.
   */
  private boolean stepPartition(final int[] s, final int[] m, final int n, final int r) {
    int k = 0;
    s[k]++;
    while (k < n - 1 && (s[k] > m[k] + 1 || s[k] > r)) {
      s[k++] = 1;
      s[k]++;
    }
    if (k == n - 1) {
      return false;
    }
    if (k > 0) {
      Arrays.fill(m, 0, k, Math.max(s[k], m[k]));
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }

    // Want to form all partitions of the set {1,...,2 = 2 * mN}
    final int n = 2 * mN;
    final long[] cnt = new long[n + 1];
    final int[] s = new int[n]; // s[k] is the number of the set in which the kth element should go
    final int[] m = new int[n]; // m[k] is the largest of the first k elements in s
    // The first way to partition a set is to put all the elements in the same subset.
    Arrays.fill(s, 1);
    Arrays.fill(m, 1);

    final HashSet<HashSet<Integer>> natural = new HashSet<>();
    final HashSet<HashSet<Integer>> mapped = new HashSet<>();
    do {
      final int limit = Math.max(s[0], m[0]);
      if (limit <= mN) { // heuristic -- this could also be bounded on the lower side?
        natural.clear();
        mapped.clear();
        for (int part = 1; part <= limit; ++part) {
          final HashSet<Integer> np = new HashSet<>();
          final HashSet<Integer> mp = new HashSet<>();
          for (int k = 1; k <= s.length; ++k) {
            if (s[k - 1] == part) {
              np.add(k);
              mp.add((k & 1) == 0 ? k - 1 : k + 1);
            }
          }
          natural.add(np);
          mapped.add(mp);
        }
        if (mapped.equals(natural)) {
          cnt[mapped.size()]++;
        }
      }
    } while (stepPartition(s, m, n, mN));

    //System.out.println(Arrays.toString(cnt));
    final long best = LongUtils.max(cnt);
    return Z.valueOf(best);
  }

}
