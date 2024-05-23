package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069788 Number of tilings by lozenges of hexagon with sides n, n+1, n, n+1, n, n+1 and central triangle removed.
 * @author Sean A. Irvine
 */
public class A069788 extends Sequence1 {

  // After Theorem 20 of Helfgott and Gessel, 1999.

  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final int q = mN / 2;
      Z t = Z.ONE;
      for (long k = q, j = 0; k >= 0; --k, ++j) {
        t = t.multiply(Z.valueOf(mN - k).pow(4 * j + 1));
      }
      for (long k = 1, j = q; k <= q + 1; ++k, --j) {
        t = t.multiply(Z.valueOf(mN + k).pow(4 * j + 1));
      }
      t = t.shiftRight((2 * q) * (2 * q + 1));
      for (int k = 1; k <= q; ++k) {
        t = t.divide(Z.valueOf(2L * k + 1).pow(8L * (q - k) + 2));
      }
      return t;
    } else {
      final int q = mN / 2;
      Z t = Z.ONE;
      for (long k = q - 1, j = 1; k >= 0; --k, ++j) {
        t = t.multiply(Z.valueOf(mN - k).pow(4 * j - 1));
      }
      for (long k = 1, j = q; k <= q; ++k, --j) {
        t = t.multiply(Z.valueOf(mN + k).pow(4 * j - 1));
      }
      t = t.shiftRight((2 * q - 1) * (2 * q));
      for (int k = 1; k < q; ++k) {
        t = t.divide(Z.valueOf(2L * k + 1).pow(8L * (q - k) - 2));
      }
      return t;
    }
  }
}

