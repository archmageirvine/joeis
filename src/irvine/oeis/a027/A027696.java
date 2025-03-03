package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A027696 Numbers k &gt;= 2 such that for some m &gt;= 2, the sum of the first m k-gonal numbers is again a k-gonal number, excluding the parametric solution m = (k^2-4*k-2)/3 when k==2 (mod 3).
 * @author Sean A. Irvine
 */
public class A027696 extends A027669 implements Conjectural {

  {
    setOffset(0);
  }

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
