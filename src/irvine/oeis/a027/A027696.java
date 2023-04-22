package irvine.oeis.a027;

import irvine.oeis.Conjectural;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A027696 Nonparametric solutions to problem in A027669: n such that for some m, the sum of the first m n-gonal numbers is again an n-gonal number.
 * @author Sean A. Irvine
 */
public class A027696 extends A027669 implements Conjectural {

  // of the sequence.
  private static final long HEURISTIC_MULTIPLIER = 100000;

  @Override
  protected boolean isExistsGonalSum(final long n) {
    Z sum = Z.ZERO;
    final TreeSet<Z> partialSums = new TreeSet<>();
    for (long k = 1; k < mN * HEURISTIC_MULTIPLIER; ++k) {
      final Z g = gonal(n, k);
      while (!partialSums.isEmpty() && partialSums.first().compareTo(g) <= 0) {
        if (g.equals(partialSums.pollFirst()) && (mN % 3 != 2 || 9 * k != mN * mN * mN - 6 * mN * mN + 3 * mN + 19)) {
          return true;
        }
      }
      sum = sum.add(g);
      partialSums.add(sum);
    }
    return false;
  }
}
