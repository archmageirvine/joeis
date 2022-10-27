package irvine.oeis.a055;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.Comparators;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A055089 List of all finite permutations in reversed colexicographic ordering.
 * @author Sean A. Irvine
 */
public class A055089 extends Sequence0 {

  private int mN = 1;
  private int mM = -1;
  protected final TreeSet<int[]> mReverseColex = new TreeSet<>(Comparators.REVERSE_COLEXICOGRAPHIC);
  {
    mReverseColex.add(new int[] {0});
  }
  private int[] mCurrentPerm = {}; // Handle identity as special case

  protected void step() {
    final Permutation perm = new Permutation(++mN);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[p.length - 1] != p.length - 1) { // ignore those which we have already
        mReverseColex.add(Arrays.copyOf(p, p.length));
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mCurrentPerm.length) {
      if (mReverseColex.isEmpty()) {
        step();
      }
      mCurrentPerm = mReverseColex.pollFirst();
      mM = 0;
    }
    return Z.valueOf(mCurrentPerm[mM] + 1);
  }
}
