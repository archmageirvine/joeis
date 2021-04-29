package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046827 Numbers n such that n^2 contains all the digits of n with the same or higher multiplicity.
 * @author Sean A. Irvine
 */
public class A046827 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private boolean ge(final int[] cnts2, final int[] cnts1) {
    for (int k = 0; k < cnts2.length; ++k) {
      if (cnts2[k] < cnts1[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts1 = ZUtils.digitCounts(mN);
      final int[] cnts2 = ZUtils.digitCounts(mN.square());
      if (ge(cnts2, cnts1)) {
        return mN;
      }
    }
  }
}
