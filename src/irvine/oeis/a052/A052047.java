package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052047 Numbers k such that the digits of k^3 occur with the same frequency.
 * @author Sean A. Irvine
 */
public class A052047 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.pow(3));
      if (IntegerUtils.isNonzeroConstant(cnts) > 0) {
        return mN;
      }
    }
  }
}

