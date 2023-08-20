package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A060120 Positions of permutations of A060118 in the canonical permutation list A055089.
 * @author Sean A. Irvine
 */
public class A060120 extends A060119 {

  private int mN = -1;

  @Override
  public Z next() {
    final int r = ++mN;
    return IntegerPermutation.permUnrank3R(r).inverse().permRevLexRank();
  }
}
