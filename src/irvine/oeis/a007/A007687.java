package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007687 Number of 4-colorings of cyclic group of order n.
 * @author Sean A. Irvine
 */
public class A007687 extends Sequence1 {

  // After Andrey Zabolotskiy

  private int mN = 0;

  protected long colorings(final int n, final int zp) {
    long result = 0;
    final long[] f = new long[zp];
    for (long i = 0; i < Z.valueOf(n).pow(zp).longValueExact(); ++i) {
      ++result;
      outer:
      for (int j1 = 0; j1 < zp; ++j1) {
        for (int j2 = 0; j2 < zp; ++j2) {
          if ((f[j1] + f[j2]) % n == f[(j1 + j2) % zp]) {
            --result;
            break outer;
          }
        }
      }
      ++f[0];
      for (int j = 0; j < zp - 1; ++j) {
        if (f[j] == n) {
          f[j] = 0;
          ++f[j + 1];
        }
      }
    }
    return result;
  }

  @Override
  public Z next() {
    return Z.valueOf(colorings(4, ++mN));
  }
}
