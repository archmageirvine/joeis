package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075397 Number of multiples of n with no zero digit with sum of digits = n.
 * @author Sean A. Irvine
 */
public class A075397 extends Sequence1 {

  // After David Wasserman

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
      t[mN - i][i % mN] = Z.ONE;
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
              newT[row][col] = newT[row][col].add(x);
            }
          }
        }
      }
      t = newT;
    }
    return t[0][0];
  }
}
