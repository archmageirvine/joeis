package irvine.oeis.a046;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A046827 Numbers k such that k^2 contains all the digits of k with the same or higher multiplicity.
 * @author Sean A. Irvine
 */
public class A046827 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts1 = ZUtils.digitCounts(mN);
      final int[] cnts2 = ZUtils.digitCounts(mN.square());
      if (IntegerUtils.ge(cnts2, cnts1)) {
        return mN;
      }
    }
  }
}
