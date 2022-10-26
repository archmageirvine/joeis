package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060120 Positions of permutations of A060118 in the canonical permutation list A055089.
 * @author Sean A. Irvine
 */
public class A060120 extends A060119 {

  private int mN = -1;

  @Override
  public Z next() {
    return permRevLexRank(permUnrank3R(++mN).inverse());
  }
}
