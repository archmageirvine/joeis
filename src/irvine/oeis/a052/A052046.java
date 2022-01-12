package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A052046 Squares whose digits occur with the same frequency.
 * @author Sean A. Irvine
 */
public class A052046 extends A000290 {

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final int[] cnts = ZUtils.digitCounts(square);
      if (IntegerUtils.isNonzeroConstant(cnts) > 0) {
        return square;
      }
    }
  }
}

