package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052095 a(n)^2 is a square whose decimal expansion digits occur with an exact frequency of 3.
 * @author Sean A. Irvine
 */
public class A052095 implements Sequence {

  private Z mN = Z.valueOf(10010);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.square());
      if (IntegerUtils.isNonzeroConstant(cnts) == 3) {
        return mN;
      }
    }
  }
}

