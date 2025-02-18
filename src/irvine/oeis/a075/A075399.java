package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075399 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int pv = 1;
    Z[][] t = new Z[mN][mN];
    for (final Z[] r : t) {
      Arrays.fill(r, Z.ZERO);
    }
    for (int i = 1; i <= Math.min(mN, 9); ++i) {
      t[mN - i][i % mN] = Z.valueOf(i);
    }
    for (int k = 1; k < mN; ++k) {
      pv *= 10;
      pv %= mN;
      final Z[][] newT = new Z[mN - k][mN];
      for (final Z[] r : newT) {
        Arrays.fill(r, Z.ZERO);
      }
      System.arraycopy(t[0], 0, newT[0], 0, mN);
      for (int i = 1; i < mN - k + 1; ++i) {
        for (int j = 0; j < mN; ++j) {
          final Z x = t[i][j];
          if (!x.isZero()) {
            for (int d = 1; d <= Math.min(i, 9); ++d) {
              final int row = i - d;
              final int col = (j + d * pv) % mN;
              final Z u = x.multiply(10).add(d);
              newT[row][col] = newT[row][col].max(Functions.DIGIT_SORT_ASCENDING.z(u));
            }
          }
        }
      }
      t = newT;
    }
    final Permutation perm = Permutation.permuter(t[0][0]);
    int[] p;
    Z best = Z.ZERO;
    while ((p = perm.next()) != null) {
      final Z v = Permutation.permToZ(p);
      if (v.mod(mN) == 0) {
        best = best.max(v);
      }
    }
    return best;
  }
}
