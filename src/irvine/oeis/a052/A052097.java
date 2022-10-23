package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A052097 a(n)^2 is a square whose decimal expansion digits occur with an exact frequency of 4.
 * @author Sean A. Irvine
 */
public class A052097 extends Sequence1 {

  private static final Z LAST = new Z("99999444387327303945");
  private Z mN = Z.valueOf(31646190);

  @Override
  public Z next() {
    if (mN.equals(LAST)) {
      return null;
    }
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.square());
      if (IntegerUtils.isNonzeroConstant(cnts) == 4) {
        return mN;
      }
    }
  }
}

