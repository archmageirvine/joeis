package irvine.oeis.a014;

import irvine.math.group.IntegerPermutationGroup;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014767.
 * @author Sean A. Irvine
 */
public class A014767 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] r = new int[++mN];
    final int[] s = new int[mN];
    for (int k = 0; k < r.length; ++k) {
      r[k] = mN - k;
      s[k] = Math.min(2 * k + 1, 2 * mN - 2 * k);
    }
    final FiniteSet<IntegerPermutation> sg = new FiniteSet<>(IntegerPermutation.createFromOneBase(r), IntegerPermutation.createFromOneBase(s));
    return new IntegerPermutationGroup(mN, sg, false).size();
  }
}
