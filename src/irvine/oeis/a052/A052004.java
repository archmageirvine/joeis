package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052004 Numbers k such that k^3 has only even digits.
 * @author Sean A. Irvine
 */
public class A052004 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.pow(3));
      if (cnts[1] == 0 && cnts[3] == 0 && cnts[5] == 0 && cnts[7] == 0 && cnts[9] == 0) {
        return mN;
      }
    }
  }
}
