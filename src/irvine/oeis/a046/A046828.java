package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046828 Digits of n^2 include digits of n, n does not end in 0.
 * @author Sean A. Irvine
 */
public class A046828 implements Sequence {

  private Z mN = Z.ZERO;

  static boolean is(final int[] cnts2, final int[] cnts1) {
    for (int k = 0; k < cnts2.length; ++k) {
      if (cnts1[k] > cnts2[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(10) != 0) {
        final int[] cnts1 = ZUtils.digitCounts(mN);
        final int[] cnts2 = ZUtils.digitCounts(mN.square());
        if (is(cnts2, cnts1)) {
          return mN;
        }
      }
    }
  }
}
