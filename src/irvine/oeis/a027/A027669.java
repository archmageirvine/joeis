package irvine.oeis.a027;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A027669 Numbers n such that for some m, the sum of the first m n-gonal numbers is again an n-gonal number.
 * @author Sean A. Irvine
 */
public class A027669 implements Sequence, Conjectural {

  private static final long HEURISTIC_MULTIPLIER = 10000;
  protected long mN = 2;

  protected Z gonal(final long n, final long k) {
    final Z kz = Z.valueOf(k);
    return kz.square().subtract(k).multiply(n - 2).divide2().add(k);
  }

  protected boolean isExistsGonalSum(final long n) {
    Z sum = Z.ZERO;
    final TreeSet<Z> partialSums = new TreeSet<>();
    for (long k = 1; k < mN * HEURISTIC_MULTIPLIER; ++k) {
      final Z g = gonal(n, k);
      while (!partialSums.isEmpty() && partialSums.first().compareTo(g) <= 0) {
        if (g.equals(partialSums.pollFirst())) {
          //System.out.println("n=" + mN + " k was " + k);
          return true;
        }
      }
      sum = sum.add(g);
      partialSums.add(sum);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isExistsGonalSum(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
