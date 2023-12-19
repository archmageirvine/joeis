package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067180 Smallest prime with digit sum n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A067524 extends Sequence1 {

  private long mN = 0;

  private boolean isComposite(final Z n) {
    return !Z.ONE.equals(n) && !n.isProbablePrime();
  }

  @Override
  public Z next() {
    if (++mN < 10) {
      final Z n = Z.valueOf(mN);
      if (isComposite(n)) {
        return n;
      }
    }
    for (long d = (mN + 8) / 9; true; ++d) {
      if (d == 1 & mN < 10) {
        continue;
      }
      for (int j = 1; j <= 9; ++j) {
        for (final Z y : A067180.g(mN - j, d - 1)) {
          final Z x = Z.TEN.pow(d - 1).multiply(j).add(y);
          if (isComposite(x)) {
            return x;
          }
        }
      }
    }
  }
}
