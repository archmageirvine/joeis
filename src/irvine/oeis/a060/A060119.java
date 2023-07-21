package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A060119 Positions of permutations of A060117 in reversed colexicographic ordering A055089.
 * @author Sean A. Irvine
 */
public class A060119 extends A060117 {

  private int mN = -1;

  /**
   * Return the reverse lexical rank of a permutation.
   * @param pp the permutation
   * @return lexical rank
   */
  public static Z permRevLexRank(final IntegerPermutation pp) {
    final int n = pp.size();
    final int[] p = new int[n];
    for (int k = 0; k < p.length; ++k) {
      p[k] = pp.image(k) + 1;
    }
    Z r = Z.ZERO;
    for (int j = n - 1; j >= 0; --j) {
      r = r.add(MemoryFactorial.SINGLETON.factorial(j).multiply(j + 1 - p[j]));
      for (int i = 0; i < j; ++i) {
        if (p[i] > p[j]) {
          --p[i];
        }
      }
    }
    return r;
  }

  @Override
  public Z next() {
    return permRevLexRank(permUnrank3R(++mN));
  }
}
