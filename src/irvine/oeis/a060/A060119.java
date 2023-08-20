package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060119 Positions of permutations of A060117 in reversed colexicographic ordering A055089.
 * @author Sean A. Irvine
 */
public class A060119 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int r = ++mN;
    return IntegerPermutation.permUnrank3R(r).permRevLexRank();
  }
}
