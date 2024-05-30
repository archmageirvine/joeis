package irvine.oeis.a055;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A055092 Order of each permutation given in reversed colexicographic ordering A055089, i.e., the least common multiple of their cycle lengths.
 * @author Sean A. Irvine
 */
public class A055092 extends Sequence0 {

  private int mN = 1;
  private final TreeSet<int[]> mReverseColex = new TreeSet<>(Comparators.REVERSE_COLEXICOGRAPHIC);
  {
    mReverseColex.add(new int[1]); // Handle identity as special case
  }

  static int lcmPerm(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    int lcm = 1;
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = p[j];
        } while (!seen[j]);
        lcm = Functions.LCM.i(lcm, len);
      }
    }
    return lcm;
  }

  @Override
  public Z next() {
    if (mReverseColex.isEmpty()) {
      final Permutation perm = new Permutation(++mN);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[p.length - 1] != p.length - 1) { // ignore those which we have already
          mReverseColex.add(Arrays.copyOf(p, p.length));
        }
      }
    }
    return Z.valueOf(lcmPerm(mReverseColex.pollFirst()));
  }
}
