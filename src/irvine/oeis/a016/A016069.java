package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016069 Numbers k such that k^2 contains exactly 2 distinct digits.
 * @author Sean A. Irvine
 */
public class A016069 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean isExactly2DigitSyndrome(Z n) {
    int used = 0;
    int cnt = 0;
    while (!n.isZero()) {
      final long bit = 1 << n.mod(10);
      if ((used & bit) == 0) {
        if (++cnt > 2) {
          return false;
        }
        used |= bit;
      }
      n = n.divide(10);
    }
    return cnt == 2;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isExactly2DigitSyndrome(mN.square())) {
        return mN;
      }
    }
  }
}
