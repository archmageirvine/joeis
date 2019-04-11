package irvine.oeis.a019;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A019589 Number of nondecreasing sequences that are differences of two permutations of <code>1,2,</code>...,n.
 * @author Sean A. Irvine
 */
public class A019589 implements Sequence {

  // After Bert Dobbelaere

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    final TreeSet<int[]> seen = new TreeSet<>((a, b) -> {
      for (int k = 0; k < a.length; ++k) {
        final int c = Integer.compare(a[k], b[k]);
        if (c != 0) {
          return c;
        }
      }
      return 0;
    });
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      final int[] s = new int[mN];
      for (int k = 0; k < mN; ++k) {
        s[k] = k - p[k];
      }
      Arrays.sort(s);
      seen.add(s);
    }
    return Z.valueOf(seen.size());
  }
}
