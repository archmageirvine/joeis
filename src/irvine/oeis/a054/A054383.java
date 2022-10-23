package irvine.oeis.a054;

import java.util.HashMap;

import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A054383 Number of (zeroless) pandigital fractions for 1/n.
 * @author Sean A. Irvine
 */
public class A054383 extends Sequence1 {

  private long mN = 0;
  private final HashMap<Integer, MutableInteger> mCounts = new HashMap<>();
  {
    // Precompute all non-zero terms
    final Permutation perm = new Permutation(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    int[] p;
    while ((p = perm.next()) != null) {
      for (int k = 4; k < 8; ++k) { // numerator must be > denominator hence can start at 4
        int num = 0;
        for (int j = 0; j <= k; ++j) {
          num *= 10;
          num += p[j];
        }
        int den = 0;
        for (int j = k + 1; j < p.length; ++j) {
          den *= 10;
          den += p[j];
        }
        if (num % den == 0) {
          final int v = num / den;
          final MutableInteger cnt = mCounts.get(v);
          if (cnt == null) {
            mCounts.put(v, new MutableInteger(1));
          } else {
            cnt.postIncrement();
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 98765432) {
      return Z.ZERO;
    }
    final MutableInteger cnt = mCounts.get((int) mN);
    return cnt == null ? Z.ZERO : Z.valueOf(cnt.get());
  }
}
