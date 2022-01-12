package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052049 a(n)^2 is a square whose digits occur with an equal minimum frequency of 2.
 * @author Sean A. Irvine
 */
public class A052049 implements Sequence {

  private Z mN = Z.valueOf(87);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] cnts = ZUtils.digitCounts(mN.square());
      if (IntegerUtils.isNonzeroConstant(cnts) > 1) {
        return mN;
      }
    }
  }
}

