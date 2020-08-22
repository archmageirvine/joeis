package irvine.oeis.a014;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014525 Order of shuffle group for deck of 3n cards.
 * @author Sean A. Irvine
 */
public class A014525 implements Sequence {

  // Conjectural formulas

  private int mN = -1;
  private Z mF = Z.ONE;

  private static boolean isPowerOf3(int n) {
    while (n > 1 && n % 3 == 0) {
      n /= 3;
    }
    return n == 1;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int m = 3 * mN;
    mF = mF.multiply(m).multiply(m - 1).multiply(m - 2);
    if (mN > 1) {
      if (isPowerOf3(mN)) {
        final int ord = IntegerUtils.ord(mN, 3);
        return Z.SIX.pow(ord + 1).multiply(ord + 1);
      }
      if ((mN & 3) == 0) {
        return mF.divide2();
      }
    }
    return mF;
  }
}
