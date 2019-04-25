package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006506 Number of n X n binary matrices with no 2 adjacent 1's, or number of configurations of non-attacking princes on an n X n board, where a "prince" attacks the four adjacent (non-diagonal) squares. Also number of independent vertex sets in an <code>n</code> X n grid.
 * @author Sean A. Irvine
 */
public class A006506 implements Sequence {

  // After Robert Gerbicz

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int l = Fibonacci.fibonacci(mN + 2).intValueExact();
    Z[] v = new Z[l];
    Arrays.fill(v, Z.ONE);
    final Z[] p = Arrays.copyOf(v, v.length);
    int c = 0;
    for (long i = 0; i < (1L << mN); ++i) {
      long j = i;
      while (j != 0 && (j & 3) != 3) {
        j /= 2;
      }
      if ((j & 3) != 3) {
        p[c++] = Z.valueOf(i);
      }
    }
    for (int i = 1; i < mN; ++i) {
      final Z[] w = new Z[l];
      Arrays.fill(w, Z.ZERO);
      for (int j = 0; j < l; ++j) {
        for (int k = 0; k < l; ++k) {
          if (p[j].and(p[k]).equals(Z.ZERO)) {
            w[j] = w[j].add(v[k]);
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
