package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000290;

/**
 * A052046 Squares whose digits occur with the same frequency.
 * @author Sean A. Irvine
 */
public class A052046 extends A000290 {

  static int isNonzeroConstant(final int[] values) {
    int a = -1;
    for (final int v : values) {
      if (v > 0) {
        if (a == -1) {
          a = v;
        } else if (a != v) {
          return 0;
        }
      }
    }
    return a;
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final int[] cnts = ZUtils.digitCounts(square);
      if (isNonzeroConstant(cnts) > 0) {
        return square;
      }
    }
  }
}

