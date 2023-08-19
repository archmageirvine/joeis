package irvine.oeis.a055;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A055090 Number of cycles (excluding fixed points) of the n-th finite permutation in reversed colexicographic ordering (A055089).
 * @author Sean A. Irvine
 */
public class A055090 extends Sequence0 {

  private int mN = 1;
  private final TreeSet<int[]> mReverseColex = new TreeSet<>(Comparators.REVERSE_COLEXICOGRAPHIC);
  {
    mReverseColex.add(new int[1]); // Handle identity as special case
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
    return Z.valueOf(IntegerPermutation.countCycles(mReverseColex.pollFirst()));
  }
}
