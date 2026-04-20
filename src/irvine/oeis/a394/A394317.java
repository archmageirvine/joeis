package irvine.oeis.a394;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A394317 Concatenated permutations of integers in decimal.
 * @author Sean A. Irvine
 */
public class A394317 extends Sequence1 {

  private int mN = 1;
  private Permutation mPermutation = new Permutation(new int[] {0});

  @Override
  public Z next() {
    int[] p = mPermutation.next();
    if (p == null) {
      mPermutation = new Permutation(IntegerUtils.identity(new int[++mN]));
      p = mPermutation.next();
    }
    return Permutation.permToZ(p);
  }
}
