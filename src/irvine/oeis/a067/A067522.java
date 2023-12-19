package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067180.
 * @author Sean A. Irvine
 */
public class A067522 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN <<= 1;
    if (mN < 0) {
      throw new UnsupportedOperationException();
    }
    if (mN == 2) {
      return Z.TWO;
    }
    for (long d = (mN + 8) / 9; true; ++d) {
      if (d == 1 & mN < 10) {
        continue;
      }
      for (int j = 1; j <= 9; ++j) {
        for (final Z y : A067180.g(mN - j, d - 1)) {
          final Z x = Z.TEN.pow(d - 1).multiply(j).add(y);
          if (x.isProbablePrime()) {
            return x;
          }
        }
      }
    }
  }
}
