package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052051 Numbers k such that k^3 is a cube whose digits occur with an equal minimum frequency of 2.
 * @author Sean A. Irvine
 */
public class A052051 implements Sequence {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.pow(3));
      if (IntegerUtils.isNonzeroConstant(cnts) > 1) {
        return mN;
      }
    }
  }
}

