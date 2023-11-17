package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066863.
 * @author Sean A. Irvine
 */
public class A066864 extends Sequence0 {

  // Computes left to right with respect to the Example picture in the OEIS.

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
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
          if (p[j].and(p[k]).isZero() && p[j].multiply2().and(p[k]).isZero()) {
            w[k] = w[k].add(v[j]);
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
