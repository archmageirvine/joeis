package irvine.oeis.a055;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A055093 Number of moved (non-fixed) elements in each permutation given in reversed colexicographic ordering A055089, i.e., the sum of their cycle lengths (excluding the 1-cycles, i.e., fixed elements).
 * @author Sean A. Irvine
 */
public class A055093 implements Sequence {

  private int mN = 1;
  private final TreeSet<int[]> mReverseColex = new TreeSet<>(Comparators.REVERSE_COLEXICOGRAPHIC);
  {
    mReverseColex.add(new int[1]); // Handle identity as special case
  }

  static int countFixed(final int[] p) {
    int fixed = 0;
    for (int k = 0; k < p.length; ++k) {
      if (p[k] == k) {
        ++fixed;
      }
    }
    return fixed;
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
    return Z.valueOf(mN - countFixed(mReverseColex.pollFirst()));
  }
}
