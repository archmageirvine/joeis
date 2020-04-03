package irvine.oeis.a030;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A030496 Permutations of <code>1,2,...,n</code> for <code>n=1,2,3,...</code>, arranged antilexicographically.
 * @author Sean A. Irvine
 */
public class A030496 implements Sequence {

  private final ArrayList<int[]> mPermutations = new ArrayList<>();
  private int mRow = 0;
  private int mPos = 0;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mPos >= mN) {
      mPos = 0;
      if (--mRow < 0) {
        mPermutations.clear();
        final Permutation permGen = new Permutation(++mN);
        int[] p;
        while ((p = permGen.next()) != null) {
          mPermutations.add(Arrays.copyOf(p, p.length));
        }
        mRow = mPermutations.size() - 1;
      }
    }
    return Z.valueOf(mPermutations.get(mRow)[mPos] + 1);
  }
}

