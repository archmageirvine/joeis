package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066863 Number of binary arrangements without adjacent 1's on n X n staggered hexagonal grid.
 * @author Sean A. Irvine
 */
public class A066863 extends Sequence1 {

  // Computes left to right with respect to the Example picture in the OEIS.

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Z> patterns = new ArrayList<>();
    for (long i = 0; i < (1L << mN); ++i) {
      long j = i;
      while (j != 0 && (j & 3) != 3) {
        j /= 2;
      }
      if ((j & 3) != 3) {
        patterns.add(Z.valueOf(i));
      }
    }
    final Z[] p = patterns.toArray(new Z[0]);
    final int l = p.length;
    Z[] v = new Z[l];
    Arrays.fill(v, Z.ONE);
    for (int i = 1; i < mN; ++i) {
      final Z[] w = new Z[l];
      Arrays.fill(w, Z.ZERO);
      for (int j = 0; j < l; ++j) {
        for (int k = 0; k < l; ++k) {
          if ((i & 1) == 0) {
            if (p[j].and(p[k]).isZero() && p[j].divide2().and(p[k]).isZero()) {
              w[k] = w[k].add(v[j]);
            }
          } else {
            if (p[j].and(p[k]).isZero() && p[j].multiply2().and(p[k]).isZero()) {
              w[k] = w[k].add(v[j]);
            }
          }
        }
      }
      v = w;
    }
    Z sum = Z.ZERO;
    for (final Z z : v) {
      sum = sum.add(z);
    }
    return sum;
  }
}
